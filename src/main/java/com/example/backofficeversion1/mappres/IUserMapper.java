package com.example.backofficeversion1.mappres;

import com.example.backofficeversion1.dtos.UserDto;
import com.example.backofficeversion1.entities.User;

public interface IUserMapper {
    UserDto fromUser(User user);

    User fromUserDto(UserDto userDto);
}
