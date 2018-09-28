package com.xyg.st.dao;

import com.xyg.st.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

    User findUser(Integer id);
}
