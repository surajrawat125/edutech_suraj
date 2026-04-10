package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;
import com.edutech.progressive.dao.TeacherDAO;
import com.edutech.progressive.entity.Teacher;
import com.edutech.progressive.service.TeacherService;

public class TeacherServiceImplJdbc implements TeacherService {

    private TeacherDAO teacherDAO;

    // Constructor to initialize the DAO
    public TeacherServiceImplJdbc(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    public List<Teacher> getAllTeachers() throws Exception {
        try {
            return teacherDAO.getAllTeachers();
        } catch (SQLException e) {
            throw new Exception("Error occurred while fetching all teachers.", e);
        }
    }

    @Override
    public Teacher getTeacherById(int teacherId) throws Exception {
        try {
            return teacherDAO.getTeacherById(teacherId);
        } catch (SQLException e) {
            throw new Exception("Error occurred while fetching teacher with ID: " + teacherId, e);
        }
    }

    @Override
    public Integer addTeacher(Teacher teacher) throws Exception {
        try {
            return teacherDAO.addTeacher(teacher);
        } catch (SQLException e) {
            throw new Exception("Error occurred while adding teacher: " + teacher.getFullName(), e);
        }
    }

    @Override
    public void updateTeacher(Teacher teacher) throws Exception {
        try {
            teacherDAO.updateTeacher(teacher);
        } catch (SQLException e) {
            throw new Exception("Error occurred while updating teacher with ID: " + teacher.getTeacherId(), e);
        }
    }

    @Override
    public void deleteTeacher(int teacherId) throws Exception {
        try {
            teacherDAO.deleteTeacher(teacherId);
        } catch (SQLException e) {
            throw new Exception("Error occurred while deleting teacher with ID: " + teacherId, e);
        }
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() throws Exception {
        try {
            return teacherDAO.getTeacherSortedByExperience();
        } catch (Exception e) {
            throw new Exception("Error occurred while fetching teachers sorted by experience.", e);
        }
    }
}
