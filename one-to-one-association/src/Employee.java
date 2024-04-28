
public class Employee {
	//instance variables.
	private String name;
	private Integer age;
	private Double salary;
	//Has-A-relationship
	Account account;
	
	//constructor injection.
	public Employee (String name,Integer age,Double salary,Account account) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.account=account;
	}
	public void getEmployeeDetails() {
		System.out.println("account details are as following:-");
		System.out.println("account type is :"+account.accountType);
		System.out.println("account no is :"+account.accountNO);
		System.out.println("account ifsc code :"+account.ifscCode);
		System.out.println("branch is :"+account.branch);
		System.out.println();
		System.out.println("employees details:-");
		System.out.println("employee name is :"+name);
		System.out.println("employee age is :"+age);
		System.out.println("employee salary is :"+salary);
	}

	
}
