package com.edutech.progressive.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.edutech.progressive.entity.Course;

import java.util.List;

public class CourseDAOImpl implements CourseDAO {

    private List<Course> courses = new ArrayList<>();

    @Override
    public int addCourse(Course course) throws SQLException {
        courses.add(course);
        // Assuming Course has a getCourseId() method
        return course.getCourseId();
    }

    @Override
    public Course getCourseById(int courseId) throws SQLException {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        return null;
    }

    @Override
    public void updateCourse(Course course) throws SQLException {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId() == course.getCourseId()) {
                courses.set(i, course);
                return;
            }
        }
    }

    @Override
    public void deleteCourse(int courseId) throws SQLException {
        courses.removeIf(course -> course.getCourseId() == courseId);
    }

    @Override
    public List<Course> getAllCourses() throws SQLException {
        return new ArrayList<>(courses);
    }
}
