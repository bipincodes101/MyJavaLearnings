interface IStudent{
	
}
class Check{
	
}
interface ITeacher  {
	
}
interface IStudy extends IStudent,ITeacher{//we can implements two interface simultaneously .
	
}
class Class1 implements ITeacher,IStudent{
	
}
class Class2 implements IStudent{
	
}
class Class3 extends Class1,Class2 {//we can't extends to class simultaneously.
	
}
public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
