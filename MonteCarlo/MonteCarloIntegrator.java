public class MonteCarloIntegrator {
	
		public double integrate() {
			Polynomial integral = new Polynomial(degree+1);
			for (int i=0; i <= degree+1; i++);
				if (i = 0) {

				}
		}

		public static void main(String[] args) {
			System.out.println("Estimating maximum and minimum...");
			System.out.println("Minimum in range: " + min);
			System.out.println("Maximum in range: " + max);
			System.out.println("Final lower bound: " + lower);
			System.out.println("Final upper bound: " + upper);
			System.out.println("start");
			
			int successfulThrows = 0;
			int numberOfThrows = 10000;
	
			if (args.length == 1) {
				try { 
			numberOfThrows = Integer.parseInt(args[0]);
				} catch (NumberFormatException nfe) {
			System.out.println("Usage: java MonteCarloIntegrator <numberOfThrows>");
			return;
				}
			}

			for (int i = 0; i < numberOfThrows; i++) {
			
			double x = Math.random();
			double y = Math.random();
			
			if ((x*x) + (y*y) <= ??? ) {
				successfulThrows++;

				System.out.println(x + " " + y + " in");
			} else {
				System.out.println(x + " " + y + " out");
			}	
			System.out.println("end");
			System.out.println("Estimate: " + estimate);
			}
		}
	}
