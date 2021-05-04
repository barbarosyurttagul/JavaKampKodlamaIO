

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Mustafa Kemal");
		customer1.setLastName("Atatürk");
		Calendar customer1Calendar = Calendar.getInstance();
		customer1Calendar.set(1938, 19, 05);
		customer1.setNationalIdentity("123456789");
		customerManager.save(customer1);
		

	}

}
