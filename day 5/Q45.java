import java.util.Scanner;

class Studento {
	private int rollNo;
	private double percentage;

	Studento() {

	}

	Studento(int rollNo, double percentage) {
		this.rollNo = rollNo;
		this.percentage = percentage;
	}

	int getrollNo() {
		return rollNo;
	}

	double getpercentage() {
		return percentage;
	}

	void show() {
		System.out.println("the student rollno is = " + rollNo + " and percentage is = " + percentage);
	}
}

class CollegeStudent extends Studento {
	private int semester;

	CollegeStudent() {

	}

	CollegeStudent(int semester, int rollNo, double percentage) {
		super(rollNo, percentage);
		this.semester = semester;
	}

	void show() {
		super.show();
		System.out.println("the student semester is = " + semester);
	}
}

class SchoolStudent extends Studento {
	private int classname;

	SchoolStudent() {

	}

	SchoolStudent(int classname, int rollNo, double percentage) {
		super(rollNo, percentage);
		this.classname = classname;
	}

	void display() {
		System.out.println("hello");
	}

	void show() {
		super.show();
		System.out.println("the student classname is = " + classname);
	}

}

public class Q45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studento s[] = { new SchoolStudent(12, 101, 80), new SchoolStudent(12, 103, 70), new SchoolStudent(12, 102, 90),
				new CollegeStudent(2, 111, 80), new CollegeStudent(3, 112, 60) };
		for (Studento a : s) {
			a.show();
			/*
			 * if (a instanceof SchoolStudent) { SchoolStudent e = (SchoolStudent) a;
			 * e.display(); }
			 */
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rollno to search student ");
		int i = sc.nextInt();
		int flag = 0;
		for (Studento a : s) {

			if (i == a.getrollNo()) {
				flag = 0;
				// System.out.println("roll no is =" + a.getrollNo());
				if (a instanceof SchoolStudent) {
					System.out.println("schoolstudent");

				} else if (a instanceof CollegeStudent) {
					System.out.println("collegestudent");
				}
				break;
			} else {
				flag = 1;

			}

		}
		if (flag == 1) {
			System.out.println("rollno is not found");
		}
		for (Studento a : s) {
			if (a.getpercentage() > 75) {
				System.out.println("student rollno is =" + a.getrollNo() + " Student have A grade");
			}
		}

	}

}
