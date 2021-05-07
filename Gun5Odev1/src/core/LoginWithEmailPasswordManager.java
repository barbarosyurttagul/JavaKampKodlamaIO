package core;



public class LoginWithEmailPasswordManager implements LoginService{

	@Override
	public void login(String message) {
		System.out.println("Email ve password ile giriş yapıldı" + message);
		
	}
	
}
