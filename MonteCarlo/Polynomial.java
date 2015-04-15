public class Polynomial {

	public double[] coeff;

	public Polynomial() {
		for (int i = 0; i < array.length / 2, i++) {
			int reversed = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = reversed;
			totalValue += Math.pow(x, i) * reversed[i];
		}
	}

	public double solve(double[] coeff) {
		double p = 0;
        for (int i = exponent; i >= 0; i--;)
            p = coeff[i] + (coeff * p);
        return p;
    }

	public static void main(String[] args) {

	}
}
