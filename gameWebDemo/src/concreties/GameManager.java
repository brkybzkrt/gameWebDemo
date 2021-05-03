package concreties;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" : oyun listesine eklenmiþtir.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" : oyun listesinden kaldýrýlmýþtýr.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" : oyun bilgileri güncellenmiþtir.");
		
	}

}
