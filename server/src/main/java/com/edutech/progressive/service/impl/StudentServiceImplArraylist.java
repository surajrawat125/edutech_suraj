package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Student;

import java.util.*;

public class StudentServiceImplArraylist {
    private static List<Student> studentList = new ArrayList<>();

    public List<Student> getAllStudents() {
        return studentList;
    }

    public Integer addStudent(Student student) {
        studentList.add(student);
        return studentList.size();
    }

    public List<Student> getAllStudentSortedByName() {
        List<Student> sortedList = new ArrayList<>(studentList);
        Collections.sort(sortedList); // Uses Student's compareTo
        return sortedList;
    }

    public void emptyArrayList() {
        studentList = new ArrayList<>();
    }
}
