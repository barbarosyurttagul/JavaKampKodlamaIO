import java.util.Calendar;

import Abstract.GamerService;
import Adapter.MernisCheckManager;
import Concrete.GamerManager;
import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calendar cal = Calendar.getInstance();
		 cal.set(1981, 1, 1);
		Gamer gamer1 = new Gamer(1, "Ahmet", "Mehmet", cal.getTime().getYear(), "123456789");
		GamerManager manager = new GamerManager(new MernisCheckManager());
		manager.save(gamer1);
		
		Game game1 = new Game();
		game1.id = 1;
		game1.name = "PUBG";
		game1.price = 50.0;
		
		Offer offer1 = new Offer();
		offer1.id = 1;
		offer1.description = "Yüzde 50 indirim";
		
		manager.order(gamer1, game1, offer1);
	}

}
