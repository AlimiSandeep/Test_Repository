package com.cg.service;
import java.util.ArrayList;
/**
 * @author Sandeep
 * @version 1.0
 * <br />
 * StudentServiceImpl provides services to validating names and marks
 * and also adding student, editing student marks,removing and viewing students
 * 
 */
import java.util.List;
import java.util.stream.Stream;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.util.IdException;
import com.cg.util.MarksException;
import com.cg.util.NameException;
import com.cg.util.StudentException;
import com.cg.vo.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao = new StudentDaoImpl();

	/**
	 * @param name String to validate
	 * @return boolean-returns true if it not empty and contains only alphabets
	 * @throws NameException-it is raised when name doesnot matches
	 */
	@Override
	public boolean validateName(String name) throws NameException {
		if (!name.matches("[a-zA-z]+") || name.equals(""))
			throw new NameException();

		return true;

	}

	
	/**
	 * @param marks double marks
	 * @return boolean -if marks are in between 0 to 100
	 * @throws MarksException-if marks are not in the range
	 */
	@Override
	public boolean marksValidation(double[] marks) throws MarksException {
		for (double mrks : marks) {
			if (mrks < 0 && mrks > 100)
				throw new MarksException();
		}
		return true;
	}

	
	/**
	 * @param student -Student Instance
	 * @return boolean-returns true if student is added
	 * @throws IdException-raises if student id already exists
	 */
	@Override
	public boolean addStudent(Student student) throws IdException {
			student.setSum(calculateTotal(student));
			student.setAvg(calculateAvg(student));
			boolean res=dao.addStudent(student);
			if(!res)
				throw new IdException();
			
		return res;
	}
	
	/**
	 * @param sid-StudentID
	 * @return Student-Sudent instance is returned for the given id
	 * @throws  StudentException-raises if student with given id doesnot exists
	 */
	@Override
	public Student viewStudentById(int sid) throws StudentException {
		Student obj=dao.viewStudentById(sid);
		if(obj==null)
			throw new StudentException();
		return obj;
	}

	
	/**
	 * @param student-Student instance
	 * @return boolean-returns true if successfully edited
	 */
	@Override
	public boolean editStudent(Student student) {
		student.setSum(calculateTotal(student));
		student.setAvg(calculateAvg(student));
		boolean res=dao.editStudent(student);
		return res;
	}
/**
 * 
 * @param student
 * @return total-sum of the marks of the student
 * 
 */
	public double calculateTotal(Student student)
	{
		double[] marks=student.getMarks();
		double total=0;
		for(double value:marks)
			total+=value;
		/*double[] arr = student.getMarks();
		double total=Stream.of(arr).mapToInt(e->e).sum();*/
		
		return total;
	}
	
	/**
	 * 
	 * @param student
	 * @return avg-returns avergae marks of the student
	 */
	
	public double calculateAvg(Student student)
	{
		double[] marks=student.getMarks();
		double avg=0;
		for(double value:marks)
		avg+=value;
		return avg/5;
		
	}
	/**
	 * @param sid-StudentId
	 * @return boolean- returns true if given student with id is removed
	 * @throws IdException-raises if no student is found with given id
	 */
	@Override
	public boolean removeStudent(int sid) throws IdException {
		boolean res=dao.removeStudent(sid);
		if(!res)
			throw new IdException();
		return true;
	}


	@Override
	public List<Student> viewAllStudents() {
		List<Student> list=new ArrayList<>();
		list=dao.viewAllStudents();
		return list;
	}

}
