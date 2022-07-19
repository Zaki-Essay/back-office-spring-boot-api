package com.example.backofficeversion1;

import com.example.backofficeversion1.dao.RoleDao;
import com.example.backofficeversion1.dao.UserDao;
import com.example.backofficeversion1.entities.Role;
import com.example.backofficeversion1.entities.User;
import com.example.backofficeversion1.utils.Gender;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class BackOfficeVersion1Application {

    public static void main(String[] args) {
        SpringApplication.run(BackOfficeVersion1Application.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(RoleDao roleDoa, UserDao userDoa){

        return args -> {

            Stream.of("khalid" , "Mohammed" , "Zakaria","Ayoub").forEach(name->{
                User user = new User();
                user.setFirstName(name);
                user.setLastName("ESSAIYDY");
                user.setDateNaissance(new Date());
                user.setGender(Gender.MALE);
                user.setPassword(UUID.randomUUID().toString());
                user.setExpired(false);
                user.setLocked(false);
                user.setPhoneNumber("00998899009");
                user.setPhoto("");
                user.setSiteWeb("");
                user.setUserName(name+"Essaiydy");

                userDoa.save(user);






            });

            Stream.of("ADMIN","USER").forEach(name->{
                Role role = new Role();
                role.setRoleName(name);

                roleDoa.save(role);





            });


            Role adminRole = roleDoa.findById(1L).orElseThrow(()->new RuntimeException("Role not found"));
            Role userRole = roleDoa.findById(2L).orElseThrow(()->new RuntimeException("role not found"));

            List<User> userList = userDoa.findAll();
            userList.forEach(user -> {
                user.getRoleList().add(userRole);
                userDoa.save(user);
            });

            User admin = userDoa.findById(3L).orElseThrow(()->
                    new RuntimeException("user not found")
            );

            admin.getRoleList().add(adminRole);
            userDoa.save(admin);

        };

    }

}
