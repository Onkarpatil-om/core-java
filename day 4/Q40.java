import java.util.*;
class Student{
	private String name;
	private int rollNo;
	private int age;
	private int score;
	Student(String name,int rollNo,int age,int score){
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		this.score=score;
	}
	public int getScore() {
		return score;
	}
	void show() {
		System.out.println("name is = "+name+"age = "+age+"Roll no = "+rollNo+"score = "+score);
	}
	
}
public class Q40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student arr[]=new Student[10];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Student name");
			String n=sc.next();
			System.out.println("Enter Student rollno");
			int r=sc.nextInt();
			System.out.println("Enter Student age");
			int a=sc.nextInt();
			System.out.println("Enter Student score");
			int sco=sc.nextInt();
			Student s=new Student(n,r,a,sco);
			arr[i]=s;
		}
		System.out.println("Group 0 to 50");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getScore()>0&&arr[i].getScore()<=50) {
				arr[i].show();
			}
		}
		System.out.println("Group 50 to 65");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getScore()>50&&arr[i].getScore()<=65) {
				arr[i].show();
			}
		}
		System.out.println("Group 65 to 80");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getScore()>65&&arr[i].getScore()<=80) {
				arr[i].show();
			}
		}
		System.out.println("Group 80 to 100");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getScore()>80&&arr[i].getScore()<=100) {
				arr[i].show();
			}
		}
		

	}

}
