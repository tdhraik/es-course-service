package com.edusys.course.service.impl;

import com.edusys.course.adapter.repository.CourseRepository;
import com.edusys.course.controller.mapper.CourseMapper;
import com.edusys.course.controller.request.AddCourseReq;
import com.edusys.course.service.CourseService;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void addCourse(Long classId, Long teacherId, AddCourseReq addCourseReq) {
        courseRepository.save(CourseMapper.mapToCourse(classId, teacherId, addCourseReq));
    }
}
