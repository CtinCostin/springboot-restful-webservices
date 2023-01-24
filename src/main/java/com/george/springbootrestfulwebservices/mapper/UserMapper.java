package com.george.springbootrestfulwebservices.mapper;

import com.george.springbootrestfulwebservices.dto.UserDto;
import com.george.springbootrestfulwebservices.entity.User;

public class UserMapper {

    public static UserDto UserToUserDto(User user) {
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }

    public static User UserDtoToUser(UserDto userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }
}
