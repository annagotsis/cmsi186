public class factorial {
	
	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		} 
		return result;

	}

	public static void main(String args[]) {
		int N = Integer.parseInt(args[0])
		System.out.println("The factorial of " + n + " is" + result);
	}
