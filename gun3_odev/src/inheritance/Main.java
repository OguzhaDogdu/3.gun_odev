package inheritance;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kodlama.io'ya ho�geldiniz.");
		
		User a = new User();
		a.setName(" Kullan�c�");
		
	
	UserManager userManager=new UserManager();
	userManager.signUp(a);
	userManager.login(a);
	
	
	User b = new User();
	b.setName("Engin");
	InstructorManager �nstructorManager = new InstructorManager();
	�nstructorManager.addCourse(b);
	
	Instructor instructor=new Instructor();
	instructor.getId();
	instructor.setId(1);
	instructor.setName("Engin");
	instructor.setPhoneNumber("050423425234");
	instructor.setEmail("engin@gmail.com");
	instructor.setPassword("****");
	instructor.setInstructorNumber(4);
	
	User c =new User();
	c.setName("Oguzhan");
	StudentManager studentmanager = new StudentManager();
	studentmanager.enroll(c);
	
	
	User d = new User();
	
	Student student = new Student();
	student.setId(5);
	student.setName("Besto");
	student.setPhoneNumber("05432456783");
	student.setEmail("besto@gmail.com");
	student.setPassword("*****");
	student.setStudentNumber(5);
	
	
	
	
	
}
}