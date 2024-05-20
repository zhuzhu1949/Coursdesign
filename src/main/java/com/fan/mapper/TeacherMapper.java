package com.fan.mapper;

import com.fan.pojo.Children;
import com.fan.pojo.ListT;
import com.fan.pojo.Teacher;
import com.fan.pojo.Understand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeacherMapper {

    Children[] cla(Teacher tea);

    List<Understand> list(Teacher tea);

    List<Understand> sel(ListT tea);

    void insa(Understand in);

    void insb(Understand in);

    void update(Understand up);

    void update0(Understand up);
}
