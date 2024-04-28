//in over-riden method we can't change method return type but by the covarient return we can change it.
class Loan{
	int a;
	public Loan interest() {
		Loan ln=new Loan();//co-varient
		System.out.println(a);
		return ln;
		
	}
	
}
class PersonalLoan extends Loan {
	String n;
	public PersonalLoan interest() {
		PersonalLoan pl=new PersonalLoan();//co-varient.
	System.out.println(n);
		return pl;
	}
}
public class CoVarient extends Loan {

	public static void main(String[] args) {
		Loan pl=new Loan();
		pl.interest();
		
	}
	
	
}
