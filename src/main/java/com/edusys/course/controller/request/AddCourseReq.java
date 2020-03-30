package com.edusys.course.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddCourseReq {

    private String courseName;

    private String courseDesc;
}
