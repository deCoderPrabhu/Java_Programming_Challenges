package programmingChallenge51_52;

import java.util.Scanner;

public class Course {
	
	static int maxCapacity = 100;
	String courseName;
	int enrolledStudent;
	
	String[] enrolledStudents;
	
	Course(String courseName){
		this.courseName = courseName;
		this.enrolledStudent = 0;
		this.enrolledStudents = new String[maxCapacity];
	}
	Course() {
		this.courseName = " ";
		this.enrolledStudent = 0;
		this.enrolledStudents = new String[maxCapacity];
	}
	
	static void setCapacity(int maxCapacity) {
		Course.maxCapacity  = maxCapacity;
	}
	
	String enrollStudent(String studentName) {
		enrolledStudents[enrolledStudent] = studentName;
		System.out.println("The student listed : " + enrolledStudents[enrolledStudent]);
		enrolledStudent++;
		return enrolledStudents[enrolledStudent];
	}
	void unenrollStudent(String studentName) {
		int i = 0;
		while(i < enrolledStudents.length) {
			if(enrolledStudents[i] == studentName ) {
				enrolledStudents[i] = " ";
				System.out.println(enrolledStudents[i] + "\n This student is deleted");
				enrolledStudent--;
				break;
			}else {
				System.out.println("This student is not listed");
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String course = " ", course1 = " ", course2 = " " ;
		String[] studentName = new String[maxCapacity];
		Course backDev = new Course(course);
		Course fullDev = new Course(course1);
		Course f_stackDev = new Course(course2);
		
		int t =  0;
		while(t < maxCapacity) {
			setCapacity(maxCapacity);
			System.out.println("Enter the Course you want to study : ");
			String courseName = course;
			System.out.println("Enter your name : ");
			String student = sc.toString();
			backDev.enrollStudent(student);
			int i = 0;
			if(studentName[i] != student ) {
				System.out.println("The Student Name is: "+ student + " Course Name : " + courseName);
				studentName[i] = student;
			}
				
			
			
			
			
			
			
		}

	}

}
