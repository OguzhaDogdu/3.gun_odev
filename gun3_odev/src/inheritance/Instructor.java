package inheritance;

public class Instructor extends User {
	
	public Instructor() {
		
	}
	public Instructor(int instructorNumber) {
		this.instructorNumber=instructorNumber;
		
	}
	private int instructorNumber;
	
	public int getInstructorNumber() {
		return instructorNumber;
	}
	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

}
