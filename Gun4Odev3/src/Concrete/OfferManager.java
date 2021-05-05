package Concrete;

import Abstract.OfferService;
import Entities.Game;
import Entities.Offer;

public class OfferManager implements OfferService{

	@Override
	public void makeOfferForAll(Offer offer, Game[] games) {
		
		for (Game game : games) {
			System.out.println(offer.description + " kampanyası " + game.name + " oyununa yapıldı");
			
		}
	}

	@Override
	public void makeOfferForAGame(Offer offer, int id) {
		
		System.out.println(offer.description + " kampanyası " + id + " id li oyuna yapıldı");
		
	}

	@Override
	public void deleteOffer(Offer offer) {
		System.out.println(offer.description + " kampanyası " + " silindi");
		
	}

	@Override
	public void updateOffer(Offer offer) {
		System.out.println(offer.description + " kampanyası " + " güncellendi");
		
	}

	

}
