//implement interface using anonymous inner class.
interface Demo{
	void display();
	void show();
	void add(int a,int b);
}
public class InterfaceUsingAnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo() {//anonymous inner class.
			public void display() {
				System.out.println("java programmer");
			}
			public void show() {
				System.out.println("java geeks");
			}
			public void add(int a,int b) {
				int c=a+b;
				System.out.println(c);
			}
		};
		d.display();
		d.show();
		d.add(10,20);
	}

}
