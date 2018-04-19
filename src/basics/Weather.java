package basics;

public class Weather {
	public static void main (String[] args) {
		//This program will give suggestions of what to wear based on the weather (temperature and sun condition)
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.print("It's  pleasant. Wear shorts and t-shirt");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.print("It's a little cooler. Perhaps wear a long-sleeve shirt and jeans.");
			System.out.print(" Wear a hat to keep the sun out of your eyes. ");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.print("This a cool day, make sure to weare warmer clothes.");
		}
		else {
			System.out.print("Looks like a cold day. Bring a sweater.");
		}
		
		System.out.print(" The program is ending");
	}

}
