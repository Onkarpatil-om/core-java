
public class Q53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "67,89,23,67,12,55,66";

		String s1[] = s.split(",");
		int sum = 0;
		for (String c : s1) {
			sum = sum + Integer.parseInt(c);
		}
		System.out.println("the sum is= " + sum);
	}

}
