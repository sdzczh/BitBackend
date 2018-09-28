package com.zh.service.impl;

import com.zh.dao.UserDAO;
import com.zh.dto.User;
import com.zh.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    private static Logger logger = Logger.getLogger(UserServiceImpl.class);


    public User findUser(Integer id) {
        return userDAO.findUser(id);
    }
}
