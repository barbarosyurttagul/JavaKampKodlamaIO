import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GoogleManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter());
		userService.login("Google");
		User user1 = new User(1, "Barbaros", "Yurttagül", "abc@abc.com", "1234567", false);
		userService.register(user1);
	}

}
