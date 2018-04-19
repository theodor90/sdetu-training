package labs2;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		StudenDatabase acc1 = new StudenDatabase("Theo", "123456789", 5000);
		StudenDatabase acc2 = new StudenDatabase("Linda", "123456789", 2000);
		StudenDatabase acc3 = new StudenDatabase("test", "123456789", 4000);
		
		acc1.setPhone("070-123 45 67");
		acc1.setCity("Malmö");
		acc1.setState("Skåne");
		showCourses();
		System.out.println(acc1.toString());
		acc1.pay(4000);
		acc2.pay(4000);
		acc1.checkBalance();
		acc2.checkBalance();
		

	}



	public static void showCourses() {
		System.out.println("Algebra");
		
	}


}


class StudenDatabase{
	
	private static int email;
	private static int iD = 1000; 
	private String UseriD;  // random 4-digit number between 1000 and 9000 and last 4 of SSN
	private String emailiD; // name + email.com
	private String name;
	private String SSN;
	private double balance = 0;
	private String state;
	private String city;
	private String phone;
	
	
	public StudenDatabase(String name, String SSN, double inDeposit) {
		//System.out.println("New Account Created");
		
		this.SSN = SSN;
		iD++;
		setUseriD();
		
		this.name = name;
		email++;
		setemailiD();
		
		balance = inDeposit;
		System.out.println(balance);
	
		

	}


	private void setUseriD() {
		int random = (int) (Math.random() * (9000 - 1000 + 1)) + 1000;
		UseriD = iD + "" + random + SSN.substring(5, 9);
		System.out.println("Your User iD is: " + UseriD);
		
	}
	
	private void setemailiD() {
		emailiD = name + "@email.com";
		//System.out.println("Your EmailAddress: " + emailiD);
	}
	
	public void pay(double amount) {
		balance = balance - amount;
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	

	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	@Override
	public String toString() {
		return "[Name: " + name + "]\n[User iD: " + UseriD + "]\n[Student Email: " + emailiD + "]";
	}


}


