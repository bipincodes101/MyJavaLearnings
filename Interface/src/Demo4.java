interface  IAccount1{//used for abstraction.(this is interface.)
	//100%abstraction.
	void display();
	void show();
}
abstract class AccountImpl implements IAccount1{//abstract class
	public  void display() {
		System.out.println("in display");
	}
}
 class Result extends AccountImpl{//concrete class.
		public void show() {
			System.out.println("in show");
		}
		public void display() {
			System.out.println("in displaying");
			
		}
	}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAccount1 ia=new Result();//loose coupling.
		ia.show();
		ia.display();
	}

}
