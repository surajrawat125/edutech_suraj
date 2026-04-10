package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;
import com.edutech.progressive.dao.StudentDAO;
import com.edutech.progressive.entity.Student;
import com.edutech.progressive.service.StudentService;

public class StudentServiceImplJdbc implements StudentService {

    private StudentDAO studentDAO;

    // Constructor to initialize the DAO
    public StudentServiceImplJdbc(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public List<Student> getAllStudents() throws Exception {
        try {
            return studentDAO.getAllStudents();
        } catch (SQLException e) {
            throw new Exception("Error occurred while fetching all students.", e);
        }
    }

    @Override
    public Student getStudentById(int studentId) throws Exception {
        try {
            return studentDAO.getStudentById(studentId);
        } catch (SQLException e) {
            throw new Exception("Error occurred while fetching student with ID: " + studentId, e);
        }
    }

    @Override
    public Integer addStudent(Student student) throws Exception {
        try {
            return studentDAO.addStudent(student);
        } catch (SQLException e) {
            throw new Exception("Error occurred while adding student: " + student.getFullName(), e);
        }
    }

    @Override
    public void updateStudent(Student student) throws Exception {
        try {
            studentDAO.updateStudent(student);
        } catch (SQLException e) {
            throw new Exception("Error occurred while updating student with ID: " + student.getStudentId(), e);
        }
    }

    @Override
    public void deleteStudent(int studentId) throws Exception {
        try {
            studentDAO.deleteStudent(studentId);
        } catch (SQLException e) {
            throw new Exception("Error occurred while deleting student with ID: " + studentId, e);
        }
    }

    @Override
    public List<Student> getAllStudentSortedByName() throws Exception {
        try {
            return studentDAO.getAllStudentSortedByName();
        } catch (SQLException e) {
            throw new Exception("Error occurred while fetching students sorted by name.", e);
        }
    }
}
