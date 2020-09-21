class PersonDemo{
	private int age;
	private String name;
		PersonDemo(){
			age=18;
		}
		PersonDemo(int age,String name){
			this.age=age;
			this.name=name;
		}
		void display() {
			System.out.println("person name= "+name+" and age is = "+age);
		}
}
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDemo p=new PersonDemo(22,"Onkar Patil");
		p.display();
	}

}
