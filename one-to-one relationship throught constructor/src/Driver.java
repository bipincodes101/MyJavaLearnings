//target object
public class Driver {
	//instance variables.
	  String dName;
	Integer dAge;
	 Integer dExperience;
	//setter and getters for dName;
	public String getDName() {
		return dName;
	}
	public void setDName(String dName) {
		this.dName="rakesh";
	}
	//setters and getters for dExperience.
	public Integer getDExperience() {
		return dExperience;
	}
	public void setDExperience(int dExperience) {
		this.dExperience=10;
	}
	//setters and getters for dAge.
	public Integer getAge() {
		return dAge;
	}
	public void setDAge(int dAge) {
		this.dAge=29;
	}
	//this is Has-A-Relationship b\w car and driver.
	Car car;//(data navigation)
	//setter and getter injection.
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car=car;
	}
	public void getDetailOfVehicle() {
		System.out.println("/this is car details:-");
		System.out.println("car name is :"+car.carName);
		System.out.println("charge of car is :"+car.chargeOfCar);
		System.out.println("cost of car is :"+car.costOfCar);
		
		
		System.out.println();
		
		System.out.println("driver name is :"+dName);
		System.out.println("driver age is :"+dAge);
		System.out.println("driver experience is :"+dExperience);
	}
}
