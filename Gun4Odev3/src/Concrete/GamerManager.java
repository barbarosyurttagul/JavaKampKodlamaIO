package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public class GamerManager implements GamerService{

	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void save(Gamer gamer) {
		if (gamerCheckService.CheckIfGamerRealPerson(gamer)) {
			System.out.println("Oyuncu sisteme kaydedildi");
		}else {
			System.out.println("Oyuncu bilgileri doğru değil");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getId() + " id li oyuncunun bilgileri güncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getId() + " id li oyuncu sistemden silindi");
		
	}
	
	public void order(Gamer gamer, Game game, Offer offer) {
		System.out.println(gamer.getFirstName() + " adlı oyuncuya " + game.name + 
						   " isimli oyun " + offer.description + " indirimi uygulanarak " +
						   game.price + " fiyatına satıldı");
	}
	
	

}
