package Adapter;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class MernisCheckManager implements GamerCheckService{

	@Override
	public Boolean CheckIfGamerRealPerson(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " "
						 + gamer.getLastName() + " isimli "
					     + gamer.getYearOfBirth() + " doğum yıllı "
						 + gamer.getNationalIdentity() + " TC Nolu"
						 + " kişi doğrulandı");
		return true;
	}

}
