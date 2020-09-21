import java.util.*;
class CircleArea{
	private double radius;
	private double area;
	private double  pi=3.14;
	
	Scanner sc=new Scanner(System.in);
	void init(){
		System.out.println("Enter radius of circle");
		double r=sc.nextDouble();
		this.radius=r;
		
	}
	void calArea() {
		this.area=pi*radius*radius;
	}
	void display() {
		System.out.println("the area of circle is= "+area);
	}
}
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleArea c=new CircleArea();
		c.init();
		c.calArea();
		c.display();

	}

}
