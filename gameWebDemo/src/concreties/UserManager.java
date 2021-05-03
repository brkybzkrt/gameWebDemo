package concreties;

import abstracts.UserService;
import entities.User;

public class UserManager implements UserService{

	private UserValidManager userValidManager;
	
	
	public UserManager(UserValidManager userValidManager) {
		
		this.userValidManager = userValidManager;
	}

	
	
	
	@Override
	public void login(User user) {
		
		System.out.println("ba�ar�yla giri� i�leminiz yap�lm��t�r");
	}

	@Override
	public void register(User user) {
		
		if(userValidManager.personIsValid(user)) {
			
			System.out.println("kayd�n�z ba�ar� ile yap�lm��t�r");
		}
		else {
			System.out.println("girilen bilgiler hatal� i�leminizi tekrar ediniz");
			
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println("bilgileriniz ba�ar�yla g�ncellenmi�tir");
		
	}

	@Override
	public void remove(User user) {
		System.out.println("hesab�n�z silinmi�tir");
		
	}

}
