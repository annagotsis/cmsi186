public class Intmonster {
	
	private byte[] byteArray;
	private int sign;


	public Intmonster() {
		this("0");
	}

	public Intmonster(String s) {
		this(s);
	}

    public void convertStringToByteArray(){
		String stringToConvert = this(s);
		byte[] byteArray = stringToConvert.getBytes();
		System.out.println(byteArray.length);
	}
	
	public String toBinary(Intmonster n) {
		if (n == 0) {
			return "0";
		}
		String binary = " ";
		while (n > 0) {
			int rem = n % 2;
			binary = rem + binary;
			n = n / 2;
		}
		return binary;
	}

	public boolean equals(Object n) {
		if (this.equals(n)) { //(n == this)
			return true;
		} else {
			return false;
		}
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
		int sum = 0; //int[] a = {}; int sum = IntStream.of(a).sum();
		for (string addend : args)
			sum += Integer.parseInt(addend);
		System.out.println(sum);
	}

	public Intmonster minus(Intmonster subtrahend) {
		Integer.parseInt(subtrahend.toString());
		System.out.println(this.toString() - subtrahend);

	}

	public Intmonster times(Intmonster factor) {
		int product = this.toString() * factor.toString();
		System.out.println(product);
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
		//if (m.sign <= 0) {

		//} throw Arithmetic Exception ae("n")

		//return result = this.remainder(m);
	}

	public static void main(String[] args) {
		new Main().convertStringToByteArray();
	}
}
