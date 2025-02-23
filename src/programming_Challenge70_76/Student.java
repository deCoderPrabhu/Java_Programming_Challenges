package programming_Challenge70_76;

public class Student {
	
	String name;
	int age;
	
	Student(String name,int age){
		this.name=name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "The Student name is: "+name+" and Age is: "+ age;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Student  =new Student("Nishant" ,23);
		System.out.println("The student details are:" + "\n"+Student);
		

	}

}
