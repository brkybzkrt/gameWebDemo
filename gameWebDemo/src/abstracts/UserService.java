package abstracts;

import entities.User;

public interface UserService {

	
	void login(User user);
	
	void register(User user);
	
	void update(User user);
	
	void remove(User user);
	
}
