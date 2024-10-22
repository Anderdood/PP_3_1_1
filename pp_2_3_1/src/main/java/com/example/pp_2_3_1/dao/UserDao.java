package com.example.pp_2_3_1.dao;

import com.example.pp_2_3_1.model.User;

import java.util.List;

public interface UserDao {
    public void save(User user);
    public void delete(Long id);
    public void update(User user);
    public User findById(Long Id);
    public List<User> getAllUsers();
}
