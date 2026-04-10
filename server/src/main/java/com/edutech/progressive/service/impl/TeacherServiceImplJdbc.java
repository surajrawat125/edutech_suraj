package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.TeacherDAO;
import com.edutech.progressive.entity.Teacher;

public class TeacherServiceImplJdbc {
    // DAO instance used for database operations.
    private TeacherDAO teacherDAO;

    public List<Teacher> getAllTeachers() {
        // Returns an empty list of teachers.
        return new ArrayList<>();
    }

    public Integer addTeacher(Teacher teacher) {
        // Returns -1, no teacher is actually added.
        return -1;
    }

    public List<Teacher> getTeacherSortedByExperience() {
        // Returns an empty list of teachers.
        return new ArrayList<>();
    }

    public void updateTeacher(Teacher teacher) {
        // Does nothing (method body is empty).
    }

    public void deleteTeacher(int teacherId) {
        // Does nothing (method body is empty).
    }

    public Teacher getTeacherById(int teacherId) {
        // Returns null for a given teacher ID.
        return null;
    }
}
