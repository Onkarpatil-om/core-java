class Tile {
	private int elength;

	Tile() {

	}

	Tile(int elength) {
		this.elength = elength;
	}

	int getElength() {
		return elength;
	}

}

class Floor extends Tile {
	private int length;
	private int width;

	Floor() {

	}

	Floor(int length, int width) {
		this.length = length;
		this.width = width;
	}

	void totalTiles(Tile t) {
		double total = (2 * length * width) / t.getElength();
		System.out.println("total tiles required are = " + total);

	}
}

public class Q42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tile t = new Tile(20);
		Floor f = new Floor(10, 10);
		f.totalTiles(t);
	}

}
