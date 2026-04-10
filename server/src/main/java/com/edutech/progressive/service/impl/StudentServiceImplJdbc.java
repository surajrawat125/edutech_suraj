package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.StudentDAO;
import com.edutech.progressive.entity.Student;

public class StudentServiceImplJdbc {
    // DAO instance used for database operations.
    private StudentDAO studentDAO;

    public List<Student> getAllStudents() {
        // Returns an empty list of students.
        return new ArrayList<>();
    }

    public Integer addStudent(Student student) {
        // Returns -1, no student is actually added.
        return -1;
    }

    public List<Student> getAllStudentsSortedByName() {
        // Returns an empty list of students.
        return new ArrayList<>();
    }

    public void updateStudent(Student student) {
        // Does nothing (method body is empty).
    }

    public void deleteStudent(int studentId) {
        // Does nothing (method body is empty).
    }

    public Student getStudentById(int studentId) {
        // Returns null for a given student ID.
        return null;
    }
}
