
public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return this.name;
	}

	public double getGpa() {
		return this.gpa;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setGpa(double newGpa) {
		this.gpa = newGpa;
	}
}
