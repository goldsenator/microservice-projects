package kz.app.userservice.service;

import java.util.List;

import kz.app.userservice.entity.User;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByName(String userName);
    User saveUser(User user);
}
