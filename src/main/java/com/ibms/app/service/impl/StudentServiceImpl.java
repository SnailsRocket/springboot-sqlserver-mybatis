package com.ibms.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibms.app.dao.master.StudentMapper;
import com.ibms.app.entity.Student;
import com.ibms.app.service.StudentService;

/**
 * @Author Druid_Xu
 * @Date 2020/11/3 下午 03:01
 * @Description
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentMapper studentMapper;

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public List<Student> getByBean() {
        return studentMapper.getByBean();
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public void delete(int id) {
        studentMapper.delete(id);
    }
}
