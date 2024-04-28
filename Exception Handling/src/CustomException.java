import java.util.Scanner;
class InvalidUserException extends Exception{
	InvalidUserException(String msg){
		super(msg);
	}
}
class Atm{
	int  cardNo=5831;
	int  atmPin=89178;
	int c;
	int p;
	public void takingDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("tell! your card no ");
		 c=sc.nextInt();
		System.out.println("tell! your atm pin");
		 p=sc.nextInt();
	}
	public void verify()throws InvalidUserException {
		if(cardNo ==c && atmPin == p) {
			System.out.println("you can take your cash");
		}
		else {
			InvalidUserException iu=new InvalidUserException("May! you forgot you card details");
			System.out.println(iu.getMessage());
			throw(iu);
		}
	}

}
class Bank {
	public void process() {
		Atm a=new Atm();	
		try {
			a.takingDetails();
			a.verify();
		} 
		catch (InvalidUserException e) {
			try {
				System.out.println("ek bar");
				a.takingDetails();
				a.verify();
				
			} 
		
			catch(InvalidUserException e1) {
				try {
					System.out.println("do bar");
					a.takingDetails();
					a.verify();
					
				} 
				catch(InvalidUserException e2) {
					try {
						System.out.println("teen bar");
						a.takingDetails();
						a.verify();
						
					} 
					catch(InvalidUserException e3) {
						System.out.println("your card is blocked please! contact to bank");
						contact();
							System.exit(0);
					}
				}
			}
		}
	}
	
	public void contact() {
		Scanner sc=new Scanner(System.in);
		System.out.println("you can give your number for contacting");
		int mobNumber=sc.nextInt();
		System.out.println("thanku ! for this information ");
	}
	
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.process();
	}

}
