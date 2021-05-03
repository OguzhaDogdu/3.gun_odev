package inheritance;

public class InstructorManager extends UserManager {
	public void addCourse(User user) {
		System.out.println("Kurs sistemine " + user.getName() + " adli egitmen yeni bir kurs ekledi.");
		System.out.println("Kurs sisteminden " + user.getName() + " adli egitmen kurs sildi.");
		System.out.println("Kurs sisteminden " + user.getName() + " adli egitmen bir kurs güncelledi.");
		
		
		
		
	}

}
