
public class Job {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("bipin","software engineer",100000,18);
		Employee e2=new Employee("aryan","ml engineer",15000,20);
		Employee e3=new Employee("tannu","machanical engineer",17000,20);
		Employee e4=new Employee("mannu","electrical engineer",18000,21);
		
		Employee[] emps=new Employee[4];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		emps[3]=e4;
		Department d=new Department("computer science",100,emps);
		d.getEmployeeDetails();
	}

}
 