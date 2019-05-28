package com.cg.dao;
/**
 * @author Sandeep
 * @version 1.0 <br />
 * StudentDaoImpl provides Dao methods for CRUD operations in the map
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.vo.Student;

public class StudentDaoImpl implements StudentDao{
private static Map<Integer,Student> smap=new HashMap<>();

/**
 * @param student Student Instance
 * Adds student to map if not present in map
 * @return boolean
 */
@Override
public boolean addStudent(Student student) {
	if(!smap.containsKey(student.getStudentId()))
	{
		smap.put(student.getStudentId(),student);
		return true;
	}
	
	return false;
}

/**
 * @param sid Student ID
 * @return Student-return student instance from emp
 */
@Override
public Student viewStudentById(int sid) {
	return smap.get(sid);
}
/**
 * @return list-return list of students from map
 */
@Override
public List<Student> viewAllStudents() {
	List<Student> list=new ArrayList<>();
	list.addAll(smap.values());
	return list;
}

/**
 * @param sid Student Id
 * @return boolean
 * Removes the student with given student id
 */
@Override
public boolean removeStudent(int sid) {
	if(smap.containsKey(sid))
		smap.remove(sid);
	return true;
}

@Override
public boolean editStudent(Student student) {
	if(smap.containsKey(student.getStudentId())) {
	smap.put(student.getStudentId(), student);
	return true;
	}
	return false;
}

}
