package com.edusys.course.controller;

import com.edusys.course.controller.request.AddCourseReq;
import com.edusys.course.service.CourseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/class/{classId}/teacher/{teacherId}/course")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public void addCourse(@PathVariable Long classId,
                          @PathVariable Long teacherId,
                          @RequestBody AddCourseReq addCourseReq) {
        courseService.addCourse(classId, teacherId, addCourseReq);
    }
}
