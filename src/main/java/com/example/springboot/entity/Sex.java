package com.example.springboot.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Class : sex
 * Company : Patsnap
 * Author  : Tao young
 * Adress  : yangtao@patsnap.com
 * Date    : 2020/4/21 13:33
 */
@Getter
public enum Sex {
    MAN("男性",1),WOMAN("女性",2);
    private String name;
    private int index;
    private Sex(String name,int index){
        this.name=name;
        this.index=index;
    }
    public static String getSex(int index) {
        for (Sex s : Sex.values()) {
            if (s.getIndex() == index) {
                return s.name;
            }
        }
        return null;
    }
}
