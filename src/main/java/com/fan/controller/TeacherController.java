package com.fan.controller;

import com.fan.pojo.*;
import com.fan.service.TeacherSrevice;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/tea")
public class TeacherController {
    @Autowired
    private TeacherSrevice teacherSrevice;

//    @PostMapping
//    public Result list(@RequestBody Teacher tea){
//        log.info("查询老师");
//        Children[] cla = teacherSrevice.cla(tea);
//        return Result.success(Tree.success(cla));
//    }
    @PostMapping
    public Result list(@RequestBody Teacher tea){
        log.info("查询老师");
        List<Understand> listt = teacherSrevice.list(tea);
        return Result.success(listt);
    }

    @PostMapping("/s")
    public Result serT(@RequestBody ListT tea){
        List<Understand> ser = teacherSrevice.sel(tea);
        return Result.success(ser);
    }

    @PostMapping("/ins")
    public Result ins(@RequestBody Understand in){
        teacherSrevice.ins(in);
        return Result.success();
    }

    @PostMapping("/update")
    public Result upd(@RequestBody Understand up){
        teacherSrevice.upd(up);
        return Result.success();
    }
}
