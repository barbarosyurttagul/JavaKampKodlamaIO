package business.concretes;

import business.abstracts.UserService;
import core.LoginService;
import core.Utility;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private LoginService loginService;
	
	public UserManager(UserDao userDao, LoginService loginService) {
		this.userDao = userDao;
		this.loginService = loginService;
	}
	
	@Override
	public void register(User user) {
		
		if(user.getPassword().length() >= 6 &&
		   Utility.validateEmail(user.getEmail()) &&
		   !userExists(user) &&
		   user.getFirstName().length() >= 2 &&
		   user.getLastName().length() >= 2) {
			userDao.register(user);
			System.out.println("Üyeliğinizi tamamlamak için email adresinize gönderilen doğrulama linkine tıklayınız.");
			
			Utility.sendActivationEmail(user.getEmail());
		}else {		
		System.out.println("Validasyon kriterleri geçilemedi. Girdiğiniz bilgileri kontrol ediniz.");
		}
	}

	@Override
	public Boolean userExists(User user) {
		System.out.println("Email kontrolü yapıldı");
		return false;
	}
	
	public void confirmActivation(User user) {
		System.out.println("Doğrulama linkine başarıyla tıkladınız");
		user.setActive(true);
	}
	
	public void login(String message) {
		loginService.login(message + " servisi ile giriş yapıldı");
	}

}
