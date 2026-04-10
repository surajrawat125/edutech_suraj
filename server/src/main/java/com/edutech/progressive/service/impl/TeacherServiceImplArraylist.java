package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Teacher;

import java.util.*;

public class TeacherServiceImplArraylist {
    private static List<Teacher> teacherList = new ArrayList<>();

    public List<Teacher> getAllTeachers() {
        return teacherList;
    }

    public Integer addTeacher(Teacher teacher) {
        teacherList.add(teacher);
        return teacherList.size();
    }

    public List<Teacher> getTeacherSortedByExperience() {
        List<Teacher> sortedList = new ArrayList<>(teacherList);
        Collections.sort(sortedList); // Uses Teacher's compareTo
        return sortedList;
    }

    public void emptyArrayList() {
        teacherList = new ArrayList<>();
    }
}

