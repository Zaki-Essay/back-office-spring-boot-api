package com.example.backofficeversion1.web;


import com.example.backofficeversion1.dtos.UserDto;
import com.example.backofficeversion1.exceptions.UserNotFoundException;
import com.example.backofficeversion1.services.IAdminService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
@RestController
public class AdminController {

    private IAdminService adminService;
    @GetMapping("/users")
    public List<UserDto> users(){
        return adminService.listUsers();
    }
    @GetMapping("/users/search")
    public List<UserDto> searchUsers(@RequestParam(name = "keyword",defaultValue = "") String keyword){
        return adminService.searchUsers("%"+keyword+"%");
    }
    @GetMapping("/users/{id}")
    public UserDto getUser(@PathVariable(name = "id") Long userId) throws UserNotFoundException {
        return  adminService.getUser(userId);
    }
    @PostMapping("/users")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return adminService.saveUser(userDto);
    }
    @PutMapping("/users/{id}")
    public UserDto updateUser(@PathVariable Long id, @RequestBody UserDto userDto){
        userDto.setUserId(id);
        return adminService.updateUser(userDto);
    }
    @DeleteMapping("/users/{id}")
    public void deleteCustomer(@PathVariable Long id){
        adminService.deleteUser(id);
    }
}
