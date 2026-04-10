package com.edutech.progressive.service.impl;

import java.util.List;

import com.edutech.progressive.dao.CourseDAO;
import com.edutech.progressive.entity.Course;

public class CourseServiceImplJdbc  {

    private CourseDAO courseDAO;

    public List<Course> getAllCourses()
    {
        return courseDAO.getAllCourses();
    }

    

}