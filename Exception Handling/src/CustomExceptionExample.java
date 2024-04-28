import java.util.Scanner;
class LackOfMoneyException extends Exception{
	LackOfMoneyException(String msg){
		super(msg);
	}
}
class CastException extends Exception {
	CastException(String msg){
		super(msg);
	}
}
class SmartnessException extends Exception {
	SmartnessException(String msg){
		super(msg);
	}
}
class Love{
	String answer="yes";
	String str="another";
	String answ;
	public void fellings() {
		Scanner sc=new Scanner(System.in);
		System.out.println("isha said to bipin i love you :");
		 answ=sc.next();
	}
	public void life() throws LackOfMoneyException,CastException {
		if(answer.equals(answ)) {
			System.out.println("you can marry to each other ");
		}
		else if (answ.equals(str)) {
			LackOfMoneyException lme=new LackOfMoneyException("bipin is happy without you enjoy your life ");
			System.out.println(lme.getMessage());
			throw(lme);
		}
		else {
			CastException ce=new CastException("you are not mine ");
			System.out.println(ce.getMessage());
			System.out.println(ce);
			throw(ce);
		}
	}
}
class God{
	public   static void display() {
		Love l=new Love();
		l.fellings();
		try {
			l.life();
		}
		catch(LackOfMoneyException | CastException ae) {
			System.out.println("please be always happy in your life");
			System.exit(0);
		}
		
	}


}
public class CustomExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		God.display();
	}

}
