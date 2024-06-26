enum Room{
	CHAIIR,TELEVISION,BED,FAN,TABLE,WASHINGMACHINE;
	//internally--> public static final Room CHAIR=new Room();
	int roomId;
	public int count=0;
	Room(){
		count++;
		System.out.println(count+" :constructor is called");
	}
	//setter
	public void setRoomId(int roomId) {
		this.roomId=roomId;
	}
	//getter
	public int getRoomId() {
		return roomId;
	}
}
public class LaunchEnumsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room.BED.setRoomId(1140);
		int id=Room.BED.getRoomId();
		System.out.println(id);
	}

}
