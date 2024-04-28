@FunctionalInterface
interface ILaunch{
	void display();
}
public class InterfaceUsingLambdaExpression {
	public static void main(String []args) {
		ILaunch l=()->{//where l is reference for interface.
			System.out.println("java programmer");
			System.out.println("java geeks");
			System.out.println("java lovers");
		};
		l.display();
	}
}
