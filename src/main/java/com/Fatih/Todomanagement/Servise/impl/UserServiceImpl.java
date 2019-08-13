package com.Fatih.Todomanagement.Servise.impl;


import com.Fatih.Todomanagement.Entity.User;
import com.Fatih.Todomanagement.Repository.UserRepository;
import com.Fatih.Todomanagement.Servise.ProjectService;
import com.Fatih.Todomanagement.Servise.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User save(User user) {
        if (user.getEmail == null) {
            throw new IllegalArgumentException("Username  cannot be null!");
        }
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
