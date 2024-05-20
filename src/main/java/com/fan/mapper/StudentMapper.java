package com.fan.mapper;

import com.fan.pojo.ListRe;
import com.fan.pojo.StuS;
import com.fan.pojo.Student;
import com.fan.pojo.Understand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
//    @Select("select * from student teacher where username= #{username} and password=#{password}")
    @Select("SELECT * FROM student WHERE username = #{username} AND password = #{password} ")
    Student getByUsernameAndPassword(Student student);
    @Select("SELECT * FROM teacher WHERE username = #{username} AND password = #{password}")
    Student getByUsernameAndPassword0(Student student);


    List<ListRe> list(Student student);

    List<ListRe> seacher(StuS stuS);

    List<Understand> listund(Student student);

    List<Student> rankk(Understand t);

    List<Understand> undSer(StuS stuS);
}
