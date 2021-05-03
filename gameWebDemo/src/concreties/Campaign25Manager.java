package concreties;

import abstracts.CampaignService;
import entities.Game;

public class Campaign25Manager implements CampaignService{

	@Override
	public double campaign(Game game) {
		
		double campaign=0.25;
		
		return game.getPrice()-(game.getPrice()*campaign);
	}

}
