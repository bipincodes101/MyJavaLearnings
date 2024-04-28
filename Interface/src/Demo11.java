interface IGames{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}
 class Adapter implements IGames{
	public void m1() {};
	public void m2() {};
	public void m3() {};
	public void m4() {};
	public void m5() {};
	
}
 class Execution extends Adapter{
	 public void m1() {
		 System.out.println("java is majedar");
	 }
	 
 }
public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGames ig=new Execution();
		ig.m1();
	}

}
