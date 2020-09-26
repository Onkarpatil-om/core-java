import java.util.Scanner;

public class Q58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println("Enter the day no which you want 0-6");
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			for (int i = 0; i <= n; i++) {

				if (i == n) {
					System.out.println("The day is = " + s[i]);
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter  valid day no");
		}

	}

}
