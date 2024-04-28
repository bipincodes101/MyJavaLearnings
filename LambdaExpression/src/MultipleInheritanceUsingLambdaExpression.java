@FunctionalInterface
interface IDemo1{
	void add(int a,int b);
}
@FunctionalInterface
interface IDemo2{
	int sub(int a);
}
@FunctionalInterface
interface IDemo3{
	int mul(int a,int b,int c);
}
public class MultipleInheritanceUsingLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implement first Functional Interface.
		IDemo1 d1=(a,b)->System.out.println(a+b);
		//implement second interface.
		IDemo2 d2=a->a-5;
		//implement third interface.
		IDemo3 d3=(a,b,c)->a*b*c;
		d1.add(5, 10);
		System.out.println(d2.sub(15));
		System.out.println(d3.mul(5, 5, 5));
		
	}

}
