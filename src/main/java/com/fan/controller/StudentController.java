package com.fan.controller;

import com.fan.pojo.*;
import com.fan.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public Result list(@RequestBody Student student){
        log.info("查询学生信息");
        List<ListRe> stuList = studentService.list(student);
        return Result.success(stuList);
    }
    @PostMapping("/s")
    public Result list(@RequestBody StuS stuS){
        log.info("查询学生课程");
        List<ListRe> stu = studentService.search(stuS);
        return Result.success(stu);
    }

    @PostMapping("/second/und")
    public Result under(@RequestBody Student student){
        log.info("查询学生成绩分析");
        List<Understand> listUn = studentService.listUn(student);
        return Result.success(listUn);
    }

    @PostMapping("/second/und/s")
    public Result undSer(@RequestBody StuS stuS){
        List<Understand> ser = studentService.ser(stuS);
        return Result.success(ser);
    }
}
