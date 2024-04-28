
public class Account {
	//instance variables
	 String accountType;
	 Integer accountNO;
	 String bankName;
	 String ifscCode;
	 String branch;
	//Initialization of constructor.
	public Account(String accountType,Integer accountNO,String bankName,String ifcCode,String branch) {
		this.accountNO=accountNO;
		this.accountType=accountType;
		this.bankName=bankName;
		this.ifscCode=ifcCode;
		this.branch=branch;
	}
	
}
