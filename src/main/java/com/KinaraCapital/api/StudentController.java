package com.KinaraCapital.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.KinaraCapital.entity.Student;
import com.KinaraCapital.services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

	StudentServices ss;

	public StudentController(StudentServices ss) {
		super();
		this.ss = ss;
	}
	@PostMapping
    public String addStudent(@RequestParam("id") int id,
                             @RequestParam("name") String name,
                             @RequestParam("totalMarks") int marks) {
        Student student = new Student(id, name, marks);
        return ss.addStudent(student);
    }
	
	@GetMapping(value="{id}")
	public Student getStudent(@PathVariable("id") int id) {
//		Student s=ss.getStudent(kodID);
		return ss.getStudent(id);
	}
	
	@GetMapping
	public List<Student> getAllStudent(){
		return ss.getAllStudent();
	}
	

}

