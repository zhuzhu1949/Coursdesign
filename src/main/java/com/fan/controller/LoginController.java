package com.fan.controller;

import com.fan.pojo.Result;
import com.fan.pojo.Student;
import com.fan.service.StudentService;
import com.fan.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
//@RequestMapping("/login")
public class LoginController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/login")
    public Result StuLongin(@RequestBody Student student){
        Student s = studentService.login(student);
        //判断：登录用户是否存在
        if(s !=null ){
            //自定义信息
            Map<String , Object> claims = new HashMap<>();
            claims.put("id", s.getId());
            claims.put("username",s.getUsername());
            claims.put("name",s.getName());
            //使用JWT工具类，生成身份令牌
            String token = JwtUtils.generateJwt(claims);
            return Result.success(token);
        }
        return Result.error("用户名或密码错误");
    }
}
