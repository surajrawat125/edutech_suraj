package com.edutech.progressive.dao;

import java.util.ArrayList;

import com.edutech.progressive.entity.Student;
import java.util.List;


public class StudentDAOImpl implements StudentDAO{

    List<Student> students = new ArrayList<>();

    @Override
    public int addStudent(Student student) {
       return -1;
    }

    @Override
    public Student getStudentById(int studentId) {
        return null;
    }

    @Override
    public void updateStudent(Student student) {
    
    }

    @Override
    public void deleteStudent(int studentId) {
      
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

 
}
