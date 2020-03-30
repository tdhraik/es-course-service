package com.edusys.course.service;

import com.edusys.course.controller.request.AddCourseReq;

public interface CourseService {

    void addCourse(Long classId, Long teacherId, AddCourseReq addCourseReq);
}
