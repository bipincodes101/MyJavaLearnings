
class Student {
	//instance variables.
	private String name;
	private Integer age;
	private Double height;
	
	public Student(String name,Integer age,Double height) {//first way to initilization of instance variables.
		this.name=name;
		this.age=age;
		this.height=height;
	}
	//second way of initilization of instance variables.
	//used setters and getters
	public String getName() {
		return name;
	}
	public void setAge(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age=age;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height=height;
	}
	public String toString() {
		return "Student=>[name="+name+" "+"age="+age+" "+"height="+height+"]";
	}
	
}
