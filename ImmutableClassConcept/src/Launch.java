//creating immutable class.if changes is made new object will be created.
//yes we can create immutable class.
final class Launch {
	int i;
	Launch(int i){//constructor.
		this.i=i;
		System.out.println(i);
		}
	final private Launch  modify(int i) {//this method for immutable class.
		if(this.i==i) {
			return this;
		}
		else {
			return new Launch(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch t1=new Launch(10);
		Launch t2=t1.modify(100);
		
		System.out.println(t1.equals(t2));
		System.out.println(t1==t2);
		
		
	}

}
