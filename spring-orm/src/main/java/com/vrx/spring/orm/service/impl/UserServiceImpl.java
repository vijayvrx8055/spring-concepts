package com.vrx.spring.orm.service.impl;

import com.vrx.spring.orm.entity.User;
import com.vrx.spring.orm.repository.UserRepository;
import com.vrx.spring.orm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(int id) {
        Optional<User> receivedUser = userRepository.findById(id);
        User user = receivedUser.orElseThrow(NoSuchElementException::new);
        LOGGER.info("User is: {}", user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        Optional<List<User>> receivedUsers = Optional.of(userRepository.findAll());
        List<User> users = receivedUsers.orElseThrow(NoSuchElementException::new);
        LOGGER.info("User size is:{}", users.size());
        LOGGER.info("Users: {}", users);
        return users;
    }

    //Save the user
    @Override
    public User saveUser(User user) {
        User savedUser = userRepository.save(user);
        LOGGER.info("User saved:{}", savedUser);
        return savedUser;
    }

    @Override
    public User updateUser(User user, int id) {
        User foundUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with provided ID not found."));
        foundUser.setName(user.getName());
        foundUser.setCity(user.getCity());
        foundUser.setAge(user.getAge());
        LOGGER.info("User updated : {}", foundUser);
        return userRepository.save(foundUser);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
        LOGGER.info("User Deleted with ID: {}", id);
    }
}
