package com.zh.dao;

import com.zh.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

    User findUser(Integer id);
}
