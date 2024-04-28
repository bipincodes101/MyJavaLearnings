class Student{
//	properties.
		 private int age;
		private String name;
		private float height;
//		method
		public  Student( int age,String name,float height){//this is constructor name same as class name 
			
			this.age=age;
			this.name=name;
			this.height=height;
		}
		int getAge() {
			return age;
		}
		String getName() {
			return name;
		}
		float getHeight() {
			return height;
		}
//		int Student() {
//			return age;
//		}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student(18,"bipin",5.5f);//here constructor automatically called.
		System.out.println(std1.getAge());
		System.out.println(std1.getHeight());
		System.out.println(std1.getName());
		Student std2=new Student(19,"rahul",5.6f);//another object is created.and constructor called.
		System.out.println(std2.getAge());
		System.out.println(std2.getHeight());
		System.out.println(std2.getName());
//		System.out.println(std2.Student());
//		int b=std2.Student();
//		System.out.println(b);
		
	}

}
