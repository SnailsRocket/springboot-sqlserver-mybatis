package com.ibms.app.dao.master;

import java.util.List;

import com.ibms.app.entity.Student;

public interface StudentMapper {

    public void insert(Student student);

    public List<Student> getByBean();

    public void update(Student student);

    public void delete(int id);
}
