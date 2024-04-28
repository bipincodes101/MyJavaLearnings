
public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating the object of course class.
		Course c1=new Course();
		c1.setCourseName("java course");
		c1.setCourseDuration(5);
		Course c2=new Course();
		c2.setCourseDuration(6);
		c2.setCourseName("data science");
		Course c3=new Course();
		c3.setCourseDuration(7);
		c3.setCourseName("devops");
		Course []courses=new Course[3];
		courses[0]=c1;
		courses[1]=c2;
		courses[2]=c3;
		//	CREATING THE OBJECT OF STUDENT CLASS.
		Student s1=new Student();
		s1.setStudentId(100);
		s1.setStudentName("bipin");
		s1.setCourse(courses);
		Student s2=new Student();
		s2.setStudentId(101);
		s2.setStudentName("aditya");
		s2.setCourse(courses);
		Student s3=new Student ();
		s3.setStudentId(102);
		s3.setStudentName("anand");
		s3.setCourse(courses);
		Student s4=new Student();
		s4.setCourse(courses);
		s4.setStudentId(103);
		s4.setStudentName("prince");
		//printin the value of student.
		System.out.println("for student 1");
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentId());
		
		s1.display();
		System.out.println("===================");
		System.out.println("for student 2");
		System.out.println(s2.getStudentName());
		System.out.println(s2.getStudentId());
		
		s2.display();
		System.out.println("=======================");
		System.out.println("for student 3");
		System.out.println(s3.getStudentName());
		System.out.println(s3.getStudentId());
		
		s3.display();
		
		
		
		
	}

}
