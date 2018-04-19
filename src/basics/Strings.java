package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The lord of the Rings";
		
		if (bookTitle.contains("Ring")) {
			System.out.println("The book contains the word Ring" + wordChoice);
		}
		
		String browser = "Chrome";
		//if (browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Theo";
		String lastName = "Nielsen";
		String SSN = "9003025153";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		// Print the initials plus last 4 digits of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.print(SSN.substring(6));

	}

}
