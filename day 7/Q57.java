import java.util.Scanner;

public class Q57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2 = "";
		String s1[] = s.split(" ");
		for (int i = 0; i < s1.length; i++) {

			String revworld = "";
			for (int j = s1[i].length() - 1; j >= 0; j--) {
				revworld += s1[i].charAt(j);
			}
			s2 = s2 + revworld + " ";
		}
		System.out.println("The reverse each world string = " + s2);

	}

}
