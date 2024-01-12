package tirgul;

public class Teacher {

	private int id;
	private String name;
	private double rate;
	
	public Teacher(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}

	public double getRate() {
		return this.rate;
	}
	
	public String toString() {
		return this.id + this.name;
	}
}
