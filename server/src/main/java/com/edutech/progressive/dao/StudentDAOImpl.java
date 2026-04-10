package com.edutech.progressive.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import com.edutech.progressive.entity.Student;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private List<Student> students = new ArrayList<>();

    @Override
    public int addStudent(Student student) throws SQLException {
        students.add(student);
        // Returns the ID of the student just added
        return student.getStudentId();
    }

    @Override
    public Student getStudentById(int studentId) throws SQLException {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void updateStudent(Student student) throws SQLException {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == student.getStudentId()) {
                students.set(i, student);
                return;
            }
        }
    }

    @Override
    public void deleteStudent(int studentId) throws SQLException {
        students.removeIf(student -> student.getStudentId() == studentId);
    }

    @Override
    public List<Student> getAllStudents() throws SQLException {
        // Returns a copy of the list
        return new ArrayList<>(students);
    }

    @Override
    public List<Student> getAllStudentSortedByName() throws SQLException {
        Collections.sort(students);
        return students;
    }
}
