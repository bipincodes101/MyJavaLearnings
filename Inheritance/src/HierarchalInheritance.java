class Stu1{
	void display() {
		System.out.println("i am parent class");
	}
}
class Stu2 extends Stu1{
	
}
class Stu3 extends Stu1{
	
}
class Stu4 extends Stu1{
	
}
class Stu5 extends Stu4{
	
}
public class HierarchalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu5 s=new Stu5();
		s.display();
	}

}
