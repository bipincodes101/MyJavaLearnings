
public class Ready {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object of car class.
		Car car=new Car();
		car.getcarName();
		car.setcarName("wagonor");
		car.getcostOfCar();
		car.setcostOfCar(5000.5);
		car.setchargeOfCar(500);
		car.getchargeOfCar();
		
		Driver driver =new Driver();
		driver.setCar(car);
		driver.getCar();
		driver.setDName("rakesh");
		driver.getDName();
		driver.setDAge(30);
		driver.getAge();
		driver.setDExperience(10);
		driver.getDExperience();
		driver.getDetailOfVehicle();
	}

}
