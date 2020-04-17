package com.example.springboot.dao;

import org.springframework.stereotype.Repository;

/**
 * Class : UserDao
 * Company : Patsnap
 * Author  : Tao young
 * Adress  : yangtao@patsnap.com
 * Date    : 2020/4/17 14:34
 */
@Repository
public interface UserDao {
    public String UserInfo(String id);
}
