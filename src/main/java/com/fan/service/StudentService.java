package com.fan.service;

import com.fan.pojo.ListRe;
import com.fan.pojo.StuS;
import com.fan.pojo.Student;
import com.fan.pojo.Understand;

import java.util.List;

public interface StudentService {
    Student login(Student student);
    List<ListRe> list(Student student);

    List<ListRe> search(StuS stuS);

    List<Understand> listUn(Student student);

    List<Understand> ser(StuS stuS);
}
