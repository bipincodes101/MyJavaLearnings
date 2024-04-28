//co-varient concept used in java 5 version, in covarient child, parent method return type is different. 
class User{
	User login() {
		System.out.println(this);
		return this;
	}
}
class Client{
	 Client login(){//covarint exapmple 
		 System.out.println(this);
		return this;
	}
}
public class CoVarient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c=new Client();
		c.login();
	}

}
