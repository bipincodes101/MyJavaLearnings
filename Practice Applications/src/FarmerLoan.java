import java.util.Scanner;
class Farmer{
	//instance variables.
	private float principleAmount;
	 private static float rateOfInterest;
	private float timePeriod;
	private float simpleInterest;
	//method for taking input from the farmer.
	void loanDeatails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("how much money you want");
		principleAmount=sc.nextFloat();
		System.out.println("decide the time period");
		timePeriod=sc.nextFloat();
	}
	static{
		
		rateOfInterest	=3;
	}
	void calculalte(){
		simpleInterest=(principleAmount*rateOfInterest*timePeriod)/100;
	}
	void slip(){
		System.out.println("you are responsible for giving this money");
		System.out.println(simpleInterest+principleAmount);
	}
}
public class FarmerLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first farmer");
		Farmer f1=new Farmer();
		f1.loanDeatails();
		f1.calculalte();
		f1.slip();
		System.out.println("second farmer");
		
		Farmer f2=new Farmer();
		f2.loanDeatails();
		f2.calculalte();
		f2.slip();
		System.out.println("third farmer");
		
		Farmer f3=new Farmer();
		f3.loanDeatails();
		f3.calculalte();
		f3.slip();
	}

}
