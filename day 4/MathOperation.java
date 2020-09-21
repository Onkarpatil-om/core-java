class MathOpe {
	static int sum(int i, int j) {
		return i + j;
	}

	static int subtract(int i, int j) {
		return i - j;
	}

	static int multiply(int i, int j) {
		return i * j;
	}

	static double power(int i, int j) {
		// double a = Math.pow(i,j);
		// return a;
		return Math.pow(i, j);
	}

}

public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = MathOpe.sum(10, 20);
		System.out.println("Sum is =" + i);
		int j = MathOpe.subtract(10, 20);
		System.out.println("Difference is =" + j);
		int k = MathOpe.multiply(10, 20);
		System.out.println("multiplication  is =" + k);
		double l = MathOpe.power(5, 2);
		System.out.println("Power is =" + l);

	}

}
