package com.fan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer classId;
    private Short sex;
    private String mobile;
}
