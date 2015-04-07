public class Intmonster {
	
	private int sign;
	private int[] mag;


	public Intmonster() {
		this("0");
	}

	public Intmonster(String s) {
		this(s);
	}

    public void convertStringToIntArray(){
		String stringToConvert = this(s);
		int[] intArray = new int[stringToConvert.length];
		for (int i = 0; i < stringToConvert.length; i++) {
			intArray[i] = Integer.parseInt(stringToConvert[i]);
		}
	}
	
	// public String toBinary(Intmonster n) {
	// 	if (n == 0) {
	// 		return "0";
	// 	}
	// 	String binary = " ";
	// 	while (n > 0) {
	// 		int rem = n % 2;
	// 		binary = rem + binary;
	// 		n = n / 2;
	// 	}
	// 	return binary;
	// }

	public boolean equals(Object n) {
		if (this == n) { 
			return true;
		}if (n == null) {
			return false;
		}if (!(n instanceof Intmonster)) {
			return false;
		}
		Intmonster other = (Intmonster)n;
		
		if(!(this.toString().equals(other.toString()))) {
			return false;
		} for (int i=0; i < mag.length; i++){
			if (nInt.mag[i] != mag[i]) {
				return false
			}
		 } return true;return true;
	}

	public boolean isGreaterThan(Intmonster n) {
		if (this < n) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isLessThan(Intmonster n) {
		if (this > n) {
			return true;
		} else {
			return false;
		}
	}

	public Intmonster plus(Intmonster addend) {
		// int sum = 0; //int[] a = {}; int sum = IntStream.of(a).sum();
		// for (string addend : args)
		// 	sum += Integer.parseInt(addend);
		// System.out.println(sum);

		int [] result;
		if (addend.sign == 0)
			return this;
		if (sign == 0)
			return addend;
		if (addend.sign == sign)
			return new Intmonster(plus(mag, addend.mag), sign);

		//System.out.print(a.charAt(0) + a.charAt(1) + a.charAt(2) + a.charAt(3) + a.charAt(4) + a.charAt(5) + a.charAt(6) + a.charAt(7) + a.charAt(8) + a.charAt(9));
	}

	public Intmonster minus(Intmonster subtrahend) {
		// Integer.parseInt(subtrahend.toString());
		// System.out.println(this.toString() - subtrahend);
		int [] result;
		if (subtrahend.sign == 0)
			return this;
		if (sign == 0)
			return subtrahend;
		if (subtrahend.sign == sign)
			return new Intmonster(minus(mag, subtrahend.mag), sign);

	}

	public Intmonster times(Intmonster factor) {
		// int product = this.toString() * factor.toString();
		// System.out.println(product);
		if (factor.sign == 0 || sign == 0)
			return 0;

		int[] result = multiply(mag, mag.length, factor.mag, factor.mag.length, null)
			return result;
	}

	public Intmonster div(Intmonster divisor) {
		//while (left > 0) {
		//if (left is odd)
		//	total = total + right;
		//halve(left);
		//halve(right);
		return null;
	}

	public Intmonster mod(Intmonster divisor) {
		/*if (divisor.sign <= 0) {

		} throw Arithmetic Exception ae("n")

		return result = this.remainder(divisor); */
	}

	public static void main(String[] args) {
		new Main().convertStringToIntArray();
	}
}
