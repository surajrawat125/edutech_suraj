package com.edutech.progressive.service;

import com.edutech.progressive.entity.Attendance;

import java.sql.SQLException;
import java.util.List;

public interface AttendanceService {

    List<Attendance> getAllAttendance();

    Attendance createAttendance(Attendance attendance) throws SQLException;

    void deleteAttendance(int attendanceId)  throws SQLException;

    List<Attendance> getAttendanceByStudent(int studentId)  throws SQLException;

    List<Attendance> getAttendanceByCourse(int courseId)  throws SQLException;
}
