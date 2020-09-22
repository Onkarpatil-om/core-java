class oneBHK {
	private int roomArea;
	private int hallArea;
	private int price;

	oneBHK() {
		roomArea = 1000;
		hallArea = 1100;
		price = 25000;
	}

	oneBHK(int roomArea, int hallArea, int price) {
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}

	int getprice() {
		return price;
	}

	void show() {
		System.out.print("roomarea  is = " + roomArea + " hallarea is = " + hallArea + " price is = " + price);
	}
}

class twoBHK extends oneBHK {
	private int room2Area;

	twoBHK() {
		super();
		room2Area = 2000;
	}

	twoBHK(int room2Area, int roomArea, int hallArea, int price) {
		super(roomArea, hallArea, price);
		this.room2Area = room2Area;
	}

	void show() {
		super.show();
		System.out.println(" room2area is = " + room2Area);
	}
}

public class Q43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoBHK b[] = { new twoBHK(1000, 1100, 2000, 25000), new twoBHK(3000, 1100, 4000, 40000),
				new twoBHK(2000, 1200, 3000, 30000) };
		int totalamount = 0;
		for (twoBHK a : b) {
			a.show();
			totalamount = totalamount + a.getprice();
		}
		System.out.println("totla amount of all flats is = " + totalamount);
	}

}
