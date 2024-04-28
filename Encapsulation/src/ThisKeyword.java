class Student{
	//these are instance variables.
	 private int age;
	 private String name;
	 private boolean flag;
	 
//	 methods
	 int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	 String getName() {
		return name;
	}
	 void setName(String name) {
		 name = name;
	}
	 void setFlag(boolean b) {
		 flag=b;
	 }
//	 for boolean we set getters as is(property).
	 boolean isFlag() {
		 return flag;
	 }
	
}


 class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student ();
		std1.setAge(18);
		System.out.println(std1.getAge());
		std1.setFlag(true);
		System.out.println(std1.isFlag());
		Student std2=new Student();
		std2.setAge(20);
		System.out.println(std2.getAge());
		
		
	}

}
