package com.example.pp_3_1_1.dao;

import com.example.pp_3_1_1.model.User;
import java.util.List;

public interface UserDao {
    public void save(User user);

    public void delete(Long id);

    public void update(User user);

    public User findById(Long Id);

    public List<User> getAllUsers();
}
