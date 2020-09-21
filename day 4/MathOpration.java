
public class MathOpration {

	static void multiply(int i,int j) {
		System.out.println("multiplication is ="+i*j);
	}
	static void multiply(float i,float j,float k) {
		System.out.println("multiplication is ="+i*j*k);
	}
	static void multiply(int i[]) {
		int b=1;
		for(int a:i) {
			b=b*a;
		}
		System.out.println("multiplication is ="+b);
	}
	static void multiply(double i,int j) {
		System.out.println("multiplication is ="+i*j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiply(10,20);
		multiply(12.5f,20.5f,25.5f);
		int arr[]= {10,20,30,40};
		multiply(arr);
		multiply(10.5,30);
	}

}
