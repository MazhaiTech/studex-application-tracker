package org.mazhai.studexapplicationtracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

 @Entity
 @Component
 @Table(name = "students")
 @Data
public class Student { 
	 @Id
	private Long id;
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String mobile;
	private String password;
	private String dob;
	private String rollNo;
	private String registerNumber;
	private String bloodgroup;
	private String address;
	private String maritialStatus;
	private String qualification;
	private String department;
	private String role;
}
