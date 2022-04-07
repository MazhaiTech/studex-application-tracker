package org.mazhai.studexapplicationtracker.controller;

import org.mazhai.studexapplicationtracker.entity.Staff;
import org.mazhai.studexapplicationtracker.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	
	@RequestMapping
	Student hello() {
		Student s1=new Student(); ;
		return s1;
	}
}
