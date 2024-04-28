//dependent object
public class Car {
	//instance variables.
	 String carName;
	 Integer chargeOfCar;
	 Double costOfCar;
	//setters and getters for initialization and returning of values.
	//setter and getters for carName;
	public String getcarName() {
		return carName;
	}
	public void setcarName(String carName) {
		this.carName=carName;
	}
	//setters and getters for chargeOfCar.
	public Integer getchargeOfCar() {
		return chargeOfCar;
	}
	public void setchargeOfCar(int chargeOfCar) {
		this.chargeOfCar=chargeOfCar;
	}
	//setters and getters for costOfCar.
	public Double getcostOfCar() {
		return costOfCar;
	}
	public void setcostOfCar(Double costOfCar) {
		this.costOfCar=costOfCar;
	}
	
}
