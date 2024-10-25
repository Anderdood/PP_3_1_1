package com.example.pp_3_1_1.service;

import com.example.pp_3_1_1.dao.UserDao;
import com.example.pp_3_1_1.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    @Transactional
    public void addUser(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        save(user);
    }

    @Transactional
    @Override
    public void modifyUser(Long id, String name, String email) {
        User user = findById(id);
        if (user != null) {
            user.setName(name);
            user.setEmail(email);
            update(user);
        }
    }

}
