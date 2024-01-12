package tirgul;

public class Teacher {

	private int id;
	private String name;
	private String last_name;
	
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

	public String getLastname() {
		return this.last_name;
	}
	
	public String toString() {
		return this.id + this.name;
	}
}
