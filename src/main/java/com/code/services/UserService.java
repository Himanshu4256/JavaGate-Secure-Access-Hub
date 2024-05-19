package com.code.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.code.entities.User;

@Service
public interface UserService {

    User saveUser(User user);

    Optional<User> getUserById(String id);

    Optional<User> updateUser(User id);

    void deleteUser(String id);

    boolean isUserExist(String userId);

    boolean isUserExistById(String email);

    List<User> getAllUsers();

}
