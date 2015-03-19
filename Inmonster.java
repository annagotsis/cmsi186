public class Intmonster {
	
	private byte[] array;


	public Intmonster() {
		this("0");
	}

	public Intmonster(String s) {
		this(s);
	}

	public String toString() {
		return toString(10);
	}

	public boolean equals(Object n) {
		if (this == n) {
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
		return null;
	}

	public Intmonster minus(Intmonster subtrahend) {
		return null;
	}

	public Intmonster times(Intmonster factor) {
		return null;
	}

	public Intmonster div(Intmonster divisor) {
		return null;
	}

	public Intmonster mod(Intmonster divisor) {
		return null;
	}

	public static void main(String[] args) {

	}
}
