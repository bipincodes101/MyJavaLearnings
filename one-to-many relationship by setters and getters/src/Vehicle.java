
public class Vehicle {
	//instance variables.
	String typeOfVehicle;
	Integer costOfVehicle;
	//setters and getters for instance variable of vehicle class.
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
	public Integer getCostOfVehicle() {
		return costOfVehicle;
	}
	public void setCostOfVehicle(Integer costOfVehicle) {
		this.costOfVehicle = costOfVehicle;
	}
	//make has-a-relationship between car and vehicle class(vehicle has a car).
	Car[]car;
	//setter injection 
	public Car []getCar() {
		return car;
	}
	void setCar(Car[]car) {
		this.car=car;
	}
	//methods for printing all the values on the console.
	void getVehicleDetails() {
		System.out.println("these are the detail of cars");
		System.out.println();
		for(Car ref:car) {
			System.out.println("car name is "+ref.carName);
			System.out.println("car model is "+ref.carModel);
			System.out.println("car price is "+ref.carPrice);
			System.out.println("car color is "+ref.carColor);
			System.out.println();
			System.out.println();
			System.out.println("type of vehicle is "+typeOfVehicle);
			System.out.println("cost of vehicle is "+costOfVehicle);
		}
	}
}
