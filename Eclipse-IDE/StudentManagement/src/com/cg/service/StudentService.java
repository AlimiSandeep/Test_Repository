package com.cg.service;

import java.util.List;

import com.cg.util.IdException;
import com.cg.util.MarksException;
import com.cg.util.NameException;
import com.cg.util.StudentException;
import com.cg.vo.Student;

public interface StudentService {
boolean validateName(String name) throws NameException;
boolean marksValidation(double[] marks) throws MarksException;
boolean addStudent(Student student) throws IdException;
Student viewStudentById(int sid) throws StudentException;
boolean editStudent(Student student);
boolean removeStudent(int sid) throws IdException;
List<Student> viewAllStudents();
}
