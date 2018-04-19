package OOPtheo;

public class Fotbollspelare {
	
	String name;
	String weaknesses;
	int YMDborn;
	int age;
	String strengths;
	int kg;
	String currentTeam;
	String pastTeams;
	int numberShirt;
	String Position;
	double contractWage;
	int contractYear;
	int gamePlayedTotal;
	int minutesPlayed;
	String nationality;
	
	
	public Fotbollspelare() {
		
	}
	
	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I play for " + currentTeam);
		System.out.println("I am " + age + " years old");
		System.out.println("I am good at " + strengths);
		System.out.println("My number on my shirt is " + numberShirt);
		System.out.println("I play as ");
	}

	public void run() {
		System.out.println("He runs in depth behind the central defenders");
	}
	
	public void scoring() {
		System.out.println("He shots at the goal");
		System.out.println("He scores");
	}
	
	public void assisting() {
		System.out.println("assisting...");
	}
	
	public void celebrating() {
		System.out.println("He celebrates with a fist in the air");
	}
}
