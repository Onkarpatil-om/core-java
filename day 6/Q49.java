interface Taxable {
	double salesTax = 0.07;
	double incomeTax = 0.10;

	void calTax();
}

class Employe implements Taxable {
	int empId;
	String name;
	double salary;

	Employe() {

	}

	Employe(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public void calTax() {
		double tax = salary * incomeTax;
		System.out.println("the yearly tax is =" + tax);
	}

}

class Productp implements Taxable {
	int pid;
	double price;
	int quantity;

	Productp() {

	}

	Productp(int pid, double price, int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	public void calTax() {
		double saleTax = (price * quantity) * salesTax;
		System.out.println("the salestax is = " + saleTax);
	}
}

public class Q49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxable t = new Employe(1, "onkar", 25000);
		Taxable t1 = new Productp(11, 200.0, 5);
		t.calTax();
		t1.calTax();
	}

}
