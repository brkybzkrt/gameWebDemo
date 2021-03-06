package concreties;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" : oyun listesine eklenmiştir.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" : oyun listesinden kaldırılmıştır.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" : oyun bilgileri güncellenmiştir.");
		
	}

}
