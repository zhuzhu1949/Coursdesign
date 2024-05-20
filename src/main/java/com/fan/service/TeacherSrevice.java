package com.fan.service;

import com.fan.pojo.Children;
import com.fan.pojo.ListT;
import com.fan.pojo.Teacher;
import com.fan.pojo.Understand;

import java.util.List;

public interface TeacherSrevice {
    Children[] cla(Teacher tea);

    List<Understand> list(Teacher tea);

    List<Understand> sel(ListT tea);

    void ins(Understand in);

    void upd(Understand up);
}
