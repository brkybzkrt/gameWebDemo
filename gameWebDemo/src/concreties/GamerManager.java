package concreties;

import abstracts.CampaignService;
import abstracts.GamerService;
import entities.Game;
import entities.Gamer;

public class GamerManager  implements GamerService{

	private CampaignService campaignService;
	
	public GamerManager(CampaignService campaignService) {
		
		this.campaignService = campaignService;
	}

	public void buy(Gamer gamer,Game game) {
		
		System.out.println(game.getName()+" oyunu - "+gamer.getNickName() +"  taraf�ndan al�nm��t�r. Fiyat : "+ game.getPrice());
	}
	
	public void buyWithACampaign(Gamer gamer,Game game) {
		
		System.out.println(game.getName()+" oyunu - "+gamer.getNickName() +" taraf�ndan  kampanyal� olarak al�nm��t�r. Fiyat : "+this.campaignService.campaign(game) );
		
	}
}
