package com.fan.service.impl;

import com.fan.mapper.TeacherMapper;
import com.fan.pojo.Children;
import com.fan.pojo.ListT;
import com.fan.pojo.Teacher;
import com.fan.pojo.Understand;
import com.fan.service.TeacherSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeaServiceimpl implements TeacherSrevice {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public Children[] cla(Teacher tea) {
        Children[] clas = teacherMapper.cla(tea);
        return clas;
    }

    @Override
    public List<Understand> list(Teacher tea) {
        List<Understand> lt = teacherMapper.list(tea);

        return lt;
    }

    @Override
    public List<Understand> sel(ListT tea) {
        List<Understand> ser = teacherMapper.sel(tea);
        return ser;
    }

    @Override
    public void ins(Understand in) {
        teacherMapper.insa(in);
        teacherMapper.insb(in);
    }

    @Override
    public void upd(Understand up) {
        teacherMapper.update(up);
        teacherMapper.update0(up);
    }
}
