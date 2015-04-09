public class PiEstimator {

	public static void main(String[] args) {
	
	int successfulThrows = 0;
	int numberOfThrows = 10000;
	
	if (args.length == 1) {
		try { 
			numberOfThrows = Integer.parseInt(args[0]);
		} catch (NumberFormatException nfe) {
			System.out.println("Usage: java PiEstimator <numberOfThrows>");
			return;
		}
	}
		System.out.println("start");

		for (int i = 0; i < numberOfThrows; i++) {
			
			double x = Math.random();
			double y = Math.random();
			
			if ((x*x) + (y*y) <= 1) {
				successfulThrows++;

				System.out.println(x + " " + y + " in");
			} else {
				System.out.println(x + " " + y + " out");
			}	
		}

		System.out.println("end");
		System.out.println("Darts: " + numberOfThrows + " Hits: " + successfulThrows + " Pi Estimate: " + 4*((double)successfulThrows/(double)numberOfThrows));
	
	}
}
