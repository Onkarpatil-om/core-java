import java.util.Scanner;

abstract class Processor {
	int data;

	abstract void Process();

	void show() {
		System.out.println("the data is = " + data);
	}
}

class Factorial extends Processor {
	void Process() {
		System.out.println("Enter the number whose factorial want");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1, fact = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		data = fact;
	}
}

class Circlea extends Processor {
	void Process() {
		final float pi = 3.14f;
		System.out.println("Enter the radius");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = pi * r * r;
		data = (int) area;
	}
}

public class Q47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter choice 1 for fact or any number for circle");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		if (s == 1) {
			Processor p = new Factorial();
			p.Process();
			p.show();
		} else {
			Processor p1 = new Circlea();

			p1.Process();
			p1.show();
		}

	}

}
