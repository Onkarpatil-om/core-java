import java.util.Scanner;

public class Q52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ar[] = s.toCharArray();
		int count = 0;
		;
		for (int i = 0; i < s.length(); i++) {

			if (ar[i] == 'a' || ar[i] == 'e' || ar[i] == 'i' || ar[i] == 'o' || ar[i] == 'u' || s.charAt(i) == 'A'
					|| s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				count++;
			}

			// System.out.println(ar[i]);
		}
		System.out.println("the no of vowels are= " + count);

	}

}
