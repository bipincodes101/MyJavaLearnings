
public class Demo2 {
//	static variables 
 static int age;
 static int roll_no;
 static String name;
 //static blockes.
 static {
	 System.out.println("i am static block");
 }
 static void setAge(int a ) {
	age=a;
 }
 static int getAge() {
	 return age;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("i am main method");
		setAge(12);
		System.out.println(getAge());
	
	}

}
