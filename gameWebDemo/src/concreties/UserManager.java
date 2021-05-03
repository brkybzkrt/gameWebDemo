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
		
		System.out.println("baþarýyla giriþ iþleminiz yapýlmýþtýr");
	}

	@Override
	public void register(User user) {
		
		if(userValidManager.personIsValid(user)) {
			
			System.out.println("kaydýnýz baþarý ile yapýlmýþtýr");
		}
		else {
			System.out.println("girilen bilgiler hatalý iþleminizi tekrar ediniz");
			
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println("bilgileriniz baþarýyla güncellenmiþtir");
		
	}

	@Override
	public void remove(User user) {
		System.out.println("hesabýnýz silinmiþtir");
		
	}

}
