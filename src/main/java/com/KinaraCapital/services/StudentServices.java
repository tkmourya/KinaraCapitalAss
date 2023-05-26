package com.KinaraCapital.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.KinaraCapital.entity.Student;
import com.KinaraCapital.repository.StudentRepository;




public interface StudentServices {
	String addStudent(Student s);
	Student getStudent(int id);
	List<Student> getAllStudent();

}
@Service
class StudentServicesImplementation implements StudentServices{
	StudentRepository srep;
	
	StudentServicesImplementation(StudentRepository srep){
		this.srep=srep;
	}

	@Override
	public String addStudent(Student s) {
		srep.save(s);
		return "Student added successfully";
	}

	@Override
	public Student getStudent(int id) {
		Student st=srep.findById(id).get();
		return st;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> slist=srep.findAll();
		return slist;
	}
	
}