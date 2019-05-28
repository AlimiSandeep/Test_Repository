package com.cg.dao;

import java.util.List;

import com.cg.vo.Student;

public interface StudentDao {

Student viewStudentById(int sid);
List<Student> viewAllStudents();
boolean removeStudent(int sid);
boolean addStudent(Student student);
boolean editStudent(Student student);

}
