import java.lang.Runnable;
import java.lang.Thread;
public class LaunchMethodReference1 {
public static void test() {
	for(int i=0;i<5;i++) {
		System.out.println("child Thread");
		
	}
}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Runnable r=LaunchMethodReference1::test;//method reference operator
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main method");
			Thread.sleep(2000);
			
		}
	}

}
