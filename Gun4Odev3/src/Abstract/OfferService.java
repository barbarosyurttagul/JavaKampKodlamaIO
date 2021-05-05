package Abstract;

import Entities.Game;
import Entities.Offer;

public interface OfferService {
	
	public void makeOfferForAll(Offer offer, Game[] games);
	
	public void makeOfferForAGame(Offer offer, int id);
	
	public void deleteOffer(Offer offer);
	
	public void updateOffer(Offer offer);

}
