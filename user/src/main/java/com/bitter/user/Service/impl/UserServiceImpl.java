package com.bitter.user.Service.impl;
import com.bitter.user.Service.UserService;
import com.bitter.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;
    @Override
    public void insertResource(int id, String name, String url) {
        userDao.insertResource(id, name, url);
        return;
    }
}
