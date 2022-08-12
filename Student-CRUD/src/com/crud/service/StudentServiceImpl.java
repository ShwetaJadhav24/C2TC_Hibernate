package com.crud.service;

import com.crud.dao.StudentDao;
import com.crud.dao.StudentDaoImpl;
import com.crud.entity.Student;


public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao;
	public StudentServiceImpl()
	{
		dao = new StudentDaoImpl();
		}

		@Override
		public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commiTransaction();
		}

		@Override
		public void updateStudent(Student student) {
			dao.beginTransaction();
			dao.updateStudent(student);
			dao.commiTransaction();
		}

		@Override
		public void removeStudent(Student student) {
			dao.beginTransaction();
			dao.removeStudent(student);
			dao.commiTransaction();
		}
		@Override
		public Student findStudentById(int id) {
			Student student = dao.getStudentById(id);
			
			return student;

}
}
