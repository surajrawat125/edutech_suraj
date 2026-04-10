package com.edutech.progressive.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.edutech.progressive.entity.Teacher;

public class TeacherDAOImpl implements TeacherDAO {

    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public int addTeacher(Teacher teacher) throws SQLException {
        teachers.add(teacher);
        // Assuming Teacher entity has a getTeacherId() method
        return teacher.getTeacherId();
    }

    @Override
    public Teacher getTeacherById(int teacherId) throws SQLException {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherId) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public void updateTeacher(Teacher teacher) throws SQLException {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getTeacherId() == teacher.getTeacherId()) {
                teachers.set(i, teacher);
                return;
            }
        }
    }

    @Override
    public void deleteTeacher(int teacherId) throws SQLException {
        teachers.removeIf(teacher -> teacher.getTeacherId() == teacherId);
    }

    @Override
    public List<Teacher> getAllTeachers() throws SQLException {
        // Returning a new list copy to maintain encapsulation
        return new ArrayList<>(teachers);
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() {
        Collections.sort(teachers);
        return teachers;
    }
}
