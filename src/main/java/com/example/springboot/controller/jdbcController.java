package com.example.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Class : jdbcController
 * Company : Patsnap
 * Author  : Tao young
 * Adress  : yangtao@patsnap.com
 * Date    : 2019/9/30 11:35
 */
@Controller
@RequestMapping("/jdbc")
public class jdbcController {
    @Autowired
    private UserService userService;

    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/userlist")
    public String getUserList(ModelMap map) {

        String sql = "select * from person_information";
        List<Map<String, Object>> userList = jdbcTemplate.queryForList(sql);
        List<User> user = new ArrayList<User>();
        User userList1 = new User();
        for (int i = 0; i < userList.size(); i++) {
            userList1.setId(String.valueOf(userList.get(i).get("id")));
            userList1.setIdcard(String.valueOf(userList.get(i).get("idcard")));
            userList1.setName(String.valueOf(userList.get(i).get("name")));
            user.add(userList1);
        }
        map.addAttribute("user", user);
        return "test12";

    }

    @ResponseBody
    @RequestMapping("/user")
    public String getUserJson(@RequestBody JSONObject jsonObject) {
        String id = jsonObject.get("id").toString();
        return userService.UserInfo(id);
    }
    @ResponseBody
    @RequestMapping("/sex")
    public List<String> getUserSexJson(@RequestBody JSONObject jsonObject) {
        String id = jsonObject.get("id").toString();
        return userService.SexInfo(id);
    }
    @ResponseBody
    @RequestMapping("/birth")
    public List<String> getUserBirthJson(@RequestBody JSONObject jsonObject) {
        String id = jsonObject.get("id").toString();
        return userService.BirthInfo(id);
    }
}
