//target object.
public class Student {
	//instance variables.
	private String studentName;
	private Integer studentId;
	
	//has-a-relationship.
	Course []course;
	//setters and getters.
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}
	//method for printing courses details.
	public void display() {
		for(Course c:course) {
			System.out.println(c.getCourseName());
			System.out.println(c.getCourseDuration());
		}
	}
	
	
	
}
