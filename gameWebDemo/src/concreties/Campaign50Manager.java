package concreties;

import abstracts.CampaignService;
import entities.Game;

public class Campaign50Manager implements CampaignService{

	@Override
	public double campaign(Game game) {
		
		double campaign=0.50;
		
		return game.getPrice()-(game.getPrice()*campaign);
	}

}
