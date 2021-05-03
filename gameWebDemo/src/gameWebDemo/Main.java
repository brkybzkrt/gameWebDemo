package gameWebDemo;

import java.time.LocalDate;

import abstracts.CampaignService;
import abstracts.Entity;
import concreties.Campaign25Manager;
import concreties.Campaign50Manager;
import concreties.Campaign75Manager;
import concreties.GamerManager;
import concreties.UserManager;
import concreties.UserValidManager;
import entities.Game;
import entities.Gamer;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		

		Game game1= new Game(1,"Rainbox Six Siege",180);
		
		User user1= new User(9,"Ahmet Berkay","Bozkurt","parola123",LocalDate.of(1998, 6, 9),"32539511740");
		
		
		UserManager userManager = new UserManager(new UserValidManager( new KPSPublicSoapProxy()));
		
		userManager.register(user1);
		
		
		
		Gamer gamer1 = new Gamer(user1,"oyuncu99");
		
		CampaignService campaignService = new Campaign75Manager(); 
		
		GamerManager gamerManager = new GamerManager(campaignService);
		
		gamerManager.buy(gamer1, game1);
		
		gamerManager.buyWithACampaign(gamer1, game1);
		
		
	}

}
