//we wanted to achieve abstraction.
//abstraction is a concept that helps to hide the actual implementation only used features .
//it is achieved usin abstract keyword and by the interface (it is more effective).
 abstract class Student{
	 
	abstract int a;//abstract keyword  can't be used in variables.
	abstract void study(); 
//		System.out.println("all students escaping from students");
//	}
	abstract public void play(); {
	//	System.out.println("all students wanted to playing");
//	}
}
class Student1{
	public void study() {//concrete method
		System.out.println("student1 do less study");
}
	public void play() {
		System.out.println(" student1 waste all time only in playing");
	}
}
class Student2{
	public void study() {
		System.out.println("student2 do more study");
	}
	public void play() {
		System.out.println("Student2 less playing");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
