package com.cg.vo;
/**
 * @author Sandeep
 * @version 1.0 <br />
 * Student is a VO contains ID,name, five subject marks and respective total and average
 */
import java.util.Arrays;
import java.util.stream.Stream;

public class Student {
	private int studentId;
	private String studentName;
	private double marks[] = new double[5];
	private double avg;
	private double sum;

	public Student(int studentId, String studentName, double[] marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;

	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return studentId + " " + studentName + " " + Arrays.toString(marks)+" "+sum+" "+avg;
	}

}
