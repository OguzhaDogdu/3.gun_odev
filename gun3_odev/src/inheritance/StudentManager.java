package inheritance;

public class StudentManager extends UserManager{
	public void enroll(User user) {
		System.out.println(user.getName() +"  adli ogrenci kursa kaydoldu.");
		System.out.println(user.getName() +"  adli ogrenci kursu bitirdi.");
		
		
	}

}
