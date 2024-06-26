import java.util.*;
public class IllegalMonitorException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Stack s1=new Stack();
		Stack s2=new Stack();
		synchronized(s1) {
			s2.wait();//illegalMonitorException
		}
	}

}
