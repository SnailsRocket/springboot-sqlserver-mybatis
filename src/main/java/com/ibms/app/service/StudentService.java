package com.ibms.app.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ibms.app.entity.Student;

@Mapper
public interface StudentService {

    public void insert(Student student);

    public List<Student> getByBean();

    public void update(Student student);

    public void delete(int id);

}
