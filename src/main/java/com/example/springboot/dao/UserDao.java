package com.example.springboot.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class : UserDao
 * Company : Patsnap
 * Author  : Tao young
 * Adress  : yangtao@patsnap.com
 * Date    : 2020/4/17 14:34
 */
@Repository
public interface UserDao {
    String UserInfo(String id);
    List<String>  SexInfo(String id);
    List<String> BirthInfo(String id);

}
