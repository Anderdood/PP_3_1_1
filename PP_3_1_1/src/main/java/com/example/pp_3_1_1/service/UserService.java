package com.example.pp_3_1_1.service;

import com.example.pp_3_1_1.model.User;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User findById(Long id);

    public void delete(Long id);

    void save(String name, String email);

    void update(Long id, String name, String email);
}