enum Direction{
	
	RIGHT,LEFT,FORWARD,BACK;	
	//RIGHT ---> public static final Direction RIGHT =new Direction();
	//LEFT ---> public static final Direction LEFT =new Direction();
	//FORWARD ---> public static final Direction FORWARD =new Direction();	
	//BACK ---> public static final Direction BACK =new Direction();
	
	//constructor initialize
	private Direction(){
		System.out.println("constructor is called");
	}
	public static int a=5;
}
public class LaunchEnum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction RIGHT=Direction.RIGHT;
		System.out.println(RIGHT);
		Direction []dir= Direction.RIGHT.values();
		for(Direction direct:dir) {
			System.out.println(direct.ordinal()+" = "+direct.toString());
			
			System.out.println(direct.ordinal()+" = "+direct.name());
		}
	}

}
