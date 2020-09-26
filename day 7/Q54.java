import java.util.Scanner;

public class Q54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name to count character ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				continue;
			}
			count++;
		}
		System.out.println("The no of character are = " + count);

	}

}
