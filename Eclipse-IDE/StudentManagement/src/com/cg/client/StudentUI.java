package com.cg.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;
import com.cg.util.IdException;
import com.cg.util.MarksException;
import com.cg.util.NameException;
import com.cg.util.StudentException;
import com.cg.vo.Student;

public class StudentUI {
	static Scanner scan = new Scanner(System.in);
	StudentService ser = new StudentServiceImpl();

	public void doAddStudent() throws NameException, IdException, MarksException {
		System.out.println("Enter the student id:");
		int sid = scan.nextInt();
		System.out.println("Enter the student name:");
		String name = scan.next();
		ser.validateName(name);
		System.out.println("Enter 5 sub  marks:");
		double[] arr = new double[5];
		for (int i = 0; i < 5; i++)
			arr[i] = scan.nextDouble();
		Student obj = new Student(sid, name, arr);

		ser.marksValidation(arr);
		boolean res = ser.addStudent(obj);
		if (res == true) {
			System.out.println("Student added successfully");
		}

	}

	public void doViewStudentById() throws StudentException {
		System.out.println("Enter the student id:");
		int sid = scan.nextInt();
		Student obj = ser.viewStudentById(sid);
		System.out.println(obj);

	}

	public void doEditStudent() throws NameException, MarksException, IdException {
		System.out.println("Enter the student id to edit:");
		int sid = scan.nextInt();
		System.out.println("Enter the new name:");
		String name = scan.next();
		ser.validateName(name);
		System.out.println("Enter new marks of 5 subjects:");
		double[] arr = new double[5];
		for (int i = 0; i < 5; i++)
			arr[i] = scan.nextDouble();

		ser.marksValidation(arr);
		Student obj = new Student(sid, name, arr);
		boolean res = ser.editStudent(obj);
		if (res == true) {
			System.out.println("Student details updated successfully");
		}

	}

	public void doViewAll() {

		List<Student> list = new ArrayList<>();
		list = ser.viewAllStudents();
		if (list.size() < 1) {
			System.out.println("No elements to display");
		} else {
			list.stream().forEach(System.out::println);
		}
	}

	public void doRemoveStudent() throws IdException {
		System.out.println("Enter the studentid to be removed:");
		int sid = scan.nextInt();
		boolean res = ser.removeStudent(sid);
		if (res == true) {
			System.out.println("Student removed successfully");
		}
	}

}
