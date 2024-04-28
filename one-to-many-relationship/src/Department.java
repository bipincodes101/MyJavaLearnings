
public class Department {
	//instance variables.
	String departmentName;
	Integer capacityOfDepartment;
	//has a relationship.
	Employee[] empl;
	//intilazion and injection in constructor
	
	Department(String departmentName, Integer capacityOfDepartment,Employee[] empl){
		this.departmentName=departmentName;
		this.capacityOfDepartment=capacityOfDepartment;
		this.empl=empl;
	}
	
	public void getEmployeeDetails() {
		System.out.println("department name is :"+departmentName);
		System.out.println("capacity of department is :"+capacityOfDepartment);
		System.out.println();
		System.out.println("details of all employees are here! ");
		for(Employee emp:empl) {
			System.out.println("employee name is :"+emp.name);
			System.out.println("emloyee age is :"+emp.age);
			System.out.println("employee salary is :"+emp.salary);
			System.out.println("employee specialization is :"+emp.specialist);
		}
		
	}
}
