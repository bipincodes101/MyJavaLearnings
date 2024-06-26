interface interf{
	public void m1(int i);
}
public class LaunchMethodReference2 {
	public void test(int  i) {
		System.out.println("from method reference");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interf i=a -> System.out.println("lambda expression");
		i.m1(12);
		System.out.println();
		interf itf=new LaunchMethodReference2()::test;
		itf.m1(12);
	}

}
