package com.eventorganizer.UserService.service;

import com.eventorganizer.UserService.model.User;

import java.util.Optional;

public interface UserService
{
    public User createUser(User user);
    public Optional<User> getUserById(Long userId);
    public Optional<User> getUserByUsername(String username);
}
