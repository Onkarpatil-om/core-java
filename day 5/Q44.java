class Faculty {
	private int facultyId;
	private double salary;

	Faculty() {

	}
	/*
	 * Faculty(int facultyId,double salary){
	 * 
	 * }
	 */

	void input(int facultyId) {
		this.facultyId = facultyId;
	}

	void setsalary(double salary) {
		this.salary = salary;
	}

	double getsalary() {
		return salary;
	}

	void print() {
		System.out.println("faculty id is =" + facultyId + " salary is = " + salary);
	}

}

class FulltimeFaculty extends Faculty {
	private double basicsal;
	private double allowance;

	FulltimeFaculty() {

	}

	void input(int facultyId) {
		super.input(facultyId);
	}

	void input(double basicsal, double allowance) {
		// input(facultyId);
		this.basicsal = basicsal;
		this.allowance = allowance;
		setsalary(basicsal + allowance);
	}
}

class PartimeFaculty extends Faculty {
	private double workingHour;
	private double rateperHour;

	void input(int facultyId) {
		super.input(facultyId);
	}

	void input(double workingHour, double rateperHour) {
		// input(facultyId);
		this.workingHour = workingHour;
		this.rateperHour = rateperHour;
		setsalary(workingHour * rateperHour);
	}

}

public class Q44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartimeFaculty p = new PartimeFaculty();
		FulltimeFaculty f = new FulltimeFaculty();
		f.input(1);
		f.input(20000, 1500);
		f.print();
		p.input(2);
		p.input(7, 200);
		p.print();

	}

}
