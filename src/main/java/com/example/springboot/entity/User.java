package com.example.springboot.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Class : user
 * Company : Patsnap
 * Author  : Tao young
 * Adress  : yangtao@patsnap.com
 * Date    : 2019/9/30 11:36
 */
@Setter
@Getter
public class User {
    //用户ID
    private String id;
    //用户身份证号
    private String idcard;
    //用户姓名
    private String name;


}
