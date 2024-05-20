package com.fan.service.impl;

import com.fan.mapper.StudentMapper;
import com.fan.pojo.ListRe;
import com.fan.pojo.StuS;
import com.fan.pojo.Student;
import com.fan.pojo.Understand;
import com.fan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceimpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student login(Student student) {
        Student login = studentMapper.getByUsernameAndPassword(student);
        Student login0 = studentMapper.getByUsernameAndPassword0(student);
        return login==null?login0:login;
    }

    @Override
    public List<ListRe> list(Student student) {

        List<ListRe> list = studentMapper.list(student);
        return list;
    }

    @Override
    public List<ListRe> search(StuS stuS) {

        return studentMapper.seacher(stuS);
    }

    @Override
    public List<Understand> listUn(Student student) {
        List<Understand> listund = studentMapper.listund(student);
//        Understand t = listund.get(0);
//        List<Student> temp = studentMapper.rankk(t);
        listund.stream().forEach(e->{

            List<Student> temp = studentMapper.rankk(e);
            temp.forEach(a->{
                if (e.getScore()==a.getScore()){
                    e.setRank(a.getId());
                }
            });
        });
        return listund;
    }

    @Override
    public List<Understand> ser(StuS stuS) {
        List<Understand> listund = studentMapper.undSer(stuS);
//        Understand t = listund.get(0);
//        List<Student> temp = studentMapper.rankk(t);
        listund.stream().forEach(e->{
            List<Student> temp = studentMapper.rankk(e);
            temp.forEach(a->{
                if (e.getScore()==a.getScore()){
                    e.setRank(a.getId());
                }
            });
        });
        return listund;
    }
}
