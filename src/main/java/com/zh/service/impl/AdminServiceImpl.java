package com.zh.service.impl;

import com.zh.dao.AdminMapper;
import com.zh.dao.UserDAO;
import com.zh.dto.Admin;
import com.zh.dto.User;
import com.zh.service.AdminService;
import com.zh.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminDAO;

    private static Logger logger = Logger.getLogger(AdminServiceImpl.class);


    public Admin findAdmin(Integer id) {
        return adminDAO.selectByPrimaryKey(id);
    }

}
