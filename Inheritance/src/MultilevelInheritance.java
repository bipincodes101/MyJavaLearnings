//object class is parent of all classes.
//this is multilevel inheritance.
class Student1{//it extends object class 
	int age;
	String name;
	//method
	void Show() {
		System.out.println("i can do it");
	}
}
class Student2 extends Student1{
	
}
class Student3 extends Student2{
	
	
}
class Student4 extends Student3{
	
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 st=new Student4();
		st.Show();
		
	}

}
