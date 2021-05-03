package abstracts;

import entities.Game;
import entities.Gamer;

public interface GamerService {
 
	
	void buy(Gamer gamer,Game game);
	
	public void buyWithACampaign(Gamer gamer,Game game);
}
