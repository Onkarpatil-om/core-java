
public class Q56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to cdac mumbai";

		int i = 0;
		String a[] = s.split(" ");
		String s2[] = new String[a.length];
		for (String b : a) {
			s2[i] = b.substring(0, 1).toUpperCase() + b.substring(1);
			i++;
		}
		String s1 = String.join(" ", s2);
		System.out.println(s1);

	}

}
