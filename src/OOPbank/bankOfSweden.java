package OOPbank;

public class bankOfSweden {

	public static void main(String[] args) {
	/*	bankAccount acc1 = new bankAccount("12345", 0.00, "Theodor Nielsen", "myeamail@theodor.com", "(087) 123-4567");
		System.out.println(acc1.getNumber());
		System.out.println(acc1.getBalance());
		System.out.println(acc1.getCustomerName());
		System.out.println(acc1.getCustomerEmailAddress());
		System.out.println(acc1.getCustomerPhoneNumber());
		
		acc1.withdrawal(100.0);
		
		acc1.deposit(50.0);
		acc1.withdrawal(100.0);
		
		acc1.deposit(51.0);
		acc1.withdrawal(100.0);
		
		bankAccount acc2 = new bankAccount("Linda", "linda@email.com", "12345");
		System.out.println(acc2.getNumber() + " name " + acc2.getCustomerName());
*/
		
		VipPerson person1 = new VipPerson();
		System.out.println(person1.getName());
		
		VipPerson person2 = new VipPerson("Linda", 25000.00);
		System.out.println(person2.getName());
		
		
		VipPerson person3 = new VipPerson("Theo", 100.00, "theo@email.com");
		System.out.println(person3.getName());
		System.out.println(person3.getEmailAddress());
		
	}

}
