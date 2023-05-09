class Student {

	//instance variable
	int rollno;
	String name;
	int age;
	
	
}



public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		class object created
		Student s1=new Student();
		
//		assign the value to the instance variables
		
		s1.name="Heena";
		s1.age=28;
		s1.rollno=100;
		
		System.out.println("Student Roll no: "+s1.rollno);
		System.out.println("Student name is: "+s1.name);
		System.out.println("Studenet age is: "+s1.age);
		
		System.out.println();
		
		Student s2=new Student();
		s2.name="Urvashi";
		s2.age=21;
		s2.rollno=102;
		
		System.out.println("Student Roll no: "+s2.rollno);
		System.out.println("Student name is: "+s2.name);
		System.out.println("Studenet age is: "+s2.age);
		

	}

}
