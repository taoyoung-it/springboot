package com.example.springboot.service;

import com.alibaba.fastjson.JSON;
import com.example.springboot.dao.UserDao;
import com.example.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Class : UserService
 * Company : Patsnap
 * Author  : Tao young
 * Adress  : yangtao@patsnap.com
 * Date    : 2020/4/17 14:40
 */
@Service
public class UserService implements UserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public String UserInfo(String id) {
        String sql="select * from person_information where id ="+id;
        List<Map<String, Object>> userList=jdbcTemplate.queryForList(sql);
        User userList1=new User();
        for (int i=0;i<userList.size();i++){
            userList1.setId(String.valueOf(userList.get(i).get("id")));
            userList1.setIdcard(String.valueOf(userList.get(i).get("idcard")));
            userList1.setName(String.valueOf(userList.get(i).get("name")));
        }
        return JSON.toJSONString(userList1);
    }



}
