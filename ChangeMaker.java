public class ChangeMaker {
	public static int getQuarters(int cents) {
		return cents/25;
	}
	public static int getDimes(int cents) {
		return cents/ 10;
	}
	public static int getNickels(int cents) {
		return cents/ 5;
	}
	public static int getPennies(int cents) {
		return cents/1;
	}
	public static int[] getChange(int cents) {
		int quarters = getQuarters(cents);
		int dimes = (getDimes(cents-(quarters*25)));
		int nickels = (getNickels(cents -((quarters*25) + (dimes*10))));
		int pennies = (getPennies(cents - ((quarters*25) + (dimes *10) + (nickels*5))));
		int[] coins = new int[] {quarters, dimes, nickels, pennies};
		return coins; 
	}
	public static String arrayToString(int[] arr) {
		String str = "( ";
		for(int i = 0; i < arr.length; i++) {
			str+= arr[i] + " ,";
		}
		str = str.substring(0, str.length() -2);
		str += ")";
		return str;
	}
 	public static void main(String [] args) {
 	
 	try { 
	 	
	 	if (args.length == 0) {
	 		System.out.println("Usage: java ChangeMaker <amount in cents>.");
	 	}
	 	int coins = Integer.parseInt(args[0]);
	 	if (coins < 0) {
	 		System.out.println("Cannot make change for negative cents");
	 	} else if (coins > 0) {
	 	System.out.println(ChangeMaker.arrayToString(ChangeMaker.getChange(coins)));
	 	}
 	} catch (NumberFormatException nfe) {
 		System.out.println("Supplied value is not an integer.");
 	}
 }
}
