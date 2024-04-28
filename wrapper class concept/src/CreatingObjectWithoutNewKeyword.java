class Student{
	
	static {
		System.out.println("Student.class file is loading");
	}
	Student(){
		System.out.println("constructor is called");
		
	}
}
public class CreatingObjectWithoutNewKeyword {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		//taking input at the run time.
		String className=args[0];
		//load the .class file in method area.
		Class c=Class.forName(className);
		//creating the object for loaded class using zero parameter constructor only.
		@SuppressWarnings("deprecation")
		Object obj=c.newInstance();
		//get the Student Object.
		Student std=  (Student)obj;
		System.out.println(std);
		
	}

	
}

