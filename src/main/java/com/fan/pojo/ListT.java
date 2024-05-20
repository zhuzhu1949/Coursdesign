package com.fan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListT {
    private String studentName;
    private String teacherName;
    private String coureName;
    private Short sex;
    private Integer score;
    private String password;
//    private String course;
//    private String teacher;
}