package com.edusys.course.controller.mapper;

import com.edusys.course.controller.request.AddCourseReq;
import com.edusys.course.domain.Course;

public class CourseMapper {

    public static Course mapToCourse(Long classId, Long teacherId, AddCourseReq addCourseReq) {
        Course course = new Course();
        course.setClassId(classId);
        course.setTeacherId(teacherId);
        course.setCourseName(addCourseReq.getCourseName());
        course.setCourseDesc(addCourseReq.getCourseDesc());
        return course;
    }
}
