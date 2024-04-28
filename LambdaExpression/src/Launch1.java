//if an interface contain only one abstract method called as Functional Interface with @FunctionalInterface annotation is information for developer and compiler both.

/* we can implement interface in 3 ways:-
 * 1.using traditional way using class and implements keyword.
 * 2.using anonymous inner class.
 * 3.using Lambda expression but in Lambda expression it is necessary to use functional interface.
 * */
@FunctionalInterface
interface IDemo{
	void display();//this method is by default public and abstract .
	
}
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for writing lambda expression -> (arrow operator or lambda operator is used.
		//d is reference for IDemo interface.
			IDemo d=()->System.out.println("java programmer");//this is lambda expression.
			d.display();//Lambda expression used  anonymous method(method without name ).
	}

}
