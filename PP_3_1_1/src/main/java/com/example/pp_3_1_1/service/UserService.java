package com.example.pp_3_1_1.service;

import com.example.pp_3_1_1.model.User;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void save(User user);

    public void update(User user);

    public User findById(Long id);

    public void delete(Long id);

    void addUser(String name, String email);

    void modifyUser(Long id, String name, String email);

}
