package com.fan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tree {
//    private Integer id;
    private String name;
    private Object children;
    public static Tree success(){
        return new Tree("班级",null);
    }
    public static Tree success(Object children){
        return new Tree("班级",children);
    }
}
