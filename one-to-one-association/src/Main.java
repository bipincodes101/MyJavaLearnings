
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account("saving",583116120,"sbi","Ifc0985f","kanpur");
		Employee employee=new Employee("bipin",18,10000.50,account);
		employee.getEmployeeDetails();
	}

}
