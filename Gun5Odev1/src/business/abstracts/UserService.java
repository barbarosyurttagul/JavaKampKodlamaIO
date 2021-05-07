package business.abstracts;

import entities.concretes.User;

public interface UserService {
	
	void register(User user);
	
	Boolean userExists(User user);
	
	public void confirmActivation(User user);
	
	public void login(String message);
}
