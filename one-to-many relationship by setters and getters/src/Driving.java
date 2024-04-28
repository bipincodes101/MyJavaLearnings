
public class Driving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.setCarColor("red");
		c1.getCarColor();
		c1.setCarModel("bi5664g");
		c1.getCarModel();
		c1.setCarName("wagonor");
		c1.getCarName();
		c1.setCarPrice(100000);
		c1.getCarPrice();
		Car []car=new Car[2];
		car[0]=c1;
		
		Vehicle vh=new Vehicle();
		vh.setTypeOfVehicle("4 whiller");
		vh.getTypeOfVehicle();
		vh.setCostOfVehicle(50000000);
		vh.getCostOfVehicle();
		vh.setCar(car);
		vh.getCar();
		vh.getVehicleDetails();
	}

}
