package com.example.demo.studentControler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.stuentModel.Student;

@RestController
@RequestMapping("student")
public class StudentController {
	  
	Student student;
	
	@GetMapping("{studentId}")
	public Student getStudentDetails(String studentId){
		
		
		return student;
	}
	
	@PostMapping
	public String createStudentDetails(@RequestBody Student student)
	{
		this.student = student;
		
		return "Successfully created";
		
	}
	@PutMapping
	public String updateStudentDeails(@RequestBody Student student)
	{
		this.student = student;
		
		return "Successfully updated";
	}
	
	@DeleteMapping("{studentId}")
	public String deleteStudentDetails(String studentId)
	{
		this.student = null;
		return "Successfully deleted";
	}
	
}
