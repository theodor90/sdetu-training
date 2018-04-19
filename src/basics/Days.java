package basics;

public class Days {
	public static void main (String[] args) {
		// Execute different block of code based on the value of a condition
		
		String dayOfWeek = "Tuesday";
		
		switch (dayOfWeek) {
		   case "Monday" : 
			   System.out.print("Today is Monday");
			   break;
		   case "Tuesday" : 
			   System.out.print("Today is Tuesday");
			   break;
		   case "Wednesday" : 
			   System.out.print("Today is Wednesday");
			   break;
		   case "Thursday" : 
			   System.out.print("Today is Thursday");
			   break;
		   case "Friday" : 
			   System.out.print("Today is Friday");
			   break;
		}
	}

}
