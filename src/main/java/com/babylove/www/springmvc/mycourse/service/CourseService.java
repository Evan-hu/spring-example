package com.babylove.www.springmvc.mycourse.service;

import org.springframework.stereotype.Service;

import com.babylove.www.springmvc.mycourse.model.Course;


public interface CourseService {
	
	/**
	 * 根据id去获取课程
	 * @param courseId
	 * @return
	 */
	Course getCoursebyId(Integer courseId);

}
