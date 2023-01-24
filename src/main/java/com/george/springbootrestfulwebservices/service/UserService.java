package com.george.springbootrestfulwebservices.service;

import com.george.springbootrestfulwebservices.dto.UserDto;
import com.george.springbootrestfulwebservices.entity.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUserById(UserDto user, Long userId);

    void deleteUser(Long UserId);
}
