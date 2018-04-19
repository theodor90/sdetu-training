package OOPtheo;

public class Teams {

	public static void main(String[] args) {
		
		Fotbollspelare Icardi;
		
		Icardi = new Fotbollspelare();
		Icardi.name = "Mauro Icardi";
		Icardi.age = 25;
		Icardi.YMDborn = 19-02-1993;
		Icardi.strengths = "Finishing and Headed attempts";
		Icardi.currentTeam = "FC Internazionale Milano";
		Icardi.pastTeams = "U.C. Sampdoria";
		Icardi.numberShirt = 9;
		Icardi.Position = "Striker";
		Icardi.gamePlayedTotal = 183;
		Icardi.nationality = "Argentina";
		
		//Icardi.speak();
		Icardi.run();
		Icardi.scoring();
		Icardi.celebrating();
		
		
		
		
		
	}

}
