class Employee{
	private static  int empNo;
	private double salary;
	private static double totalSalary;
		Employee(int empNo,double salary){
			this.empNo=empNo;
			this.totalSalary+=salary;
		}
		void display() {
			System.out.println("employee are ="+empNo+" and total salary of all employee ="+totalSalary);
		}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(1,10000);
		Employee e1=new Employee(2,20000);
		Employee e2=new Employee(3,30000);
		Employee e3=new Employee(4,25000);
		Employee e4=new Employee(5,40000);
		e4.display();


	}

}
