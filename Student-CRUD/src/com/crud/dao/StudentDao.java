package com.crud.dao;

import com.crud.entity.Student;

public interface StudentDao {
	
	public abstract Student getStudentById(int id); // to retrieve Data

	public abstract  void addStudent(Student student);  //persist
	public abstract  void removeStudent(Student student);
	public abstract  void updateStudent (Student student); //merge
	public abstract  void commiTransaction();
	public abstract  void beginTransaction();

}
