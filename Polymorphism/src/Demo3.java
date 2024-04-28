//we don't call specialized method directly by reference we use downcasting for calling specialized method.
class Parents{
	
}
class Balak1 extends Parents{
	public void smoking() {//this is specialized method.
		System.out.println("child1 smokes");
	}
}
class Balak2 extends Parents{
	public void drinking() {//this is specialized method.
		System.out.println("child2 drinkes");
	}
}
class Balak3 extends Parents{
	public void dancing() {//this is specialized method.
		System.out.println("child3 goes bar");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents p1=new Balak1();//upcasting or loose coupling
		((Balak1)p1).smoking();//downcasting
		Parents p2=new Balak2();
		((Balak2)p2).drinking();//downcasting
		Parents p3=new Balak3();
		((Balak3)p3).dancing();//downcasting
		
	}

}
