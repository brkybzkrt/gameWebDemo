package entities;

import abstracts.Entity;


public class Gamer implements Entity{

	
	private int userId;
	private String nickName;
	
	
	
	
	public Gamer(User user, String nickName) {
		
		this.userId = user.getId();
		this.nickName = nickName;
	}
	
	
	
	



	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
	public int getUserId() {
		return this.userId;
	}
	
	
}
