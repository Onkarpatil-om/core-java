import java.util.*;
class Product{
	private int pid;
	private double price;
	private int quantity;
	Product(int pid,double price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	static int maxPid(Product b[]) {
		 double a=b[0].price;
		 int k=0;
		 for(int i=0;i<b.length;i++) {
			 if(a<b[i].price) {
				 a=b[i].price;
			 }
		 }
		 for(int i=0;i<b.length;i++) {
			 if(b[i].price==a) {
				  k=b[i].pid;
				
			 }
		 }
		 return k;
	 }
	
	 static void show(Product a[]) {
		int p1=maxPid(a);
		System.out.println("max price pid is= "+p1);
		 double amount=0;
		 for(int k=0;k<a.length;k++) {
			 amount=amount+a[k].price*a[k].quantity;
		 }
		 System.out.println("Total amount spent is= "+amount+" Rs");
	}
	
}
public class ProductDemo {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in); 
		Product arr[]=new Product[3];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter pid");
			int pi=sc.nextInt();
			System.out.println("Enter price");
			double pri=sc.nextDouble();
			System.out.println("Enter quantity");
			int q=sc.nextInt();
			Product p=new Product(pi,pri,q);
			arr[i]=p;
		}
		/*for(Product a:arr) {
			a.show();
		}*/
		Product.show(arr);
		
	}

}
