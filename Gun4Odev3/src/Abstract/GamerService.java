package Abstract;

import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public interface GamerService {

	void save(Gamer gamer);
	
	void update(Gamer gamer);
	
	void delete(Gamer gamer);
	
	void order(Gamer gamer, Game game, Offer offer);
}
