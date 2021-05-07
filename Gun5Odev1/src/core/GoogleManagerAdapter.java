package core;

import google.GoogleManager;

public class GoogleManagerAdapter implements LoginService{

	@Override
	public void login(String message) {
		
		GoogleManager googleManager = new GoogleManager();
		googleManager.login("Google ile Giriş sağlandı" + message);
		
	}

}
