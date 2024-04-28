class Stu{
	//instance variables
	private int age;
	private String name;
	//constructor
	Stu(int age,String name){
		this();
		this.age=age;
		this.name=name;
	}
	Stu(){
		this("java");
		System.out.println("this is first then age");
	}
	Stu(String name){
		this("bipin",18);
		this.name=name;
		System.out.println("Science");
	}
	Stu(String name,int age){
		System.out.println("java programmer");
	}
}
public class ThisMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu std=new Stu(18,"bipin");	
	}
}
