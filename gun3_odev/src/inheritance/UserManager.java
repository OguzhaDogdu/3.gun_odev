package inheritance;

public class UserManager {
	public void login (User user) {
		System.out.println( user.getName() + " sisteme giri� yapt�!" );

}
	public void signUp(User user) {
		System.out.println( user.getName() + " sisteme kaydoldu!" );
}
}