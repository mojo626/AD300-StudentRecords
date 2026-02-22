import java.util.Map;
import java.util.TreeMap;

public class StudentRecordManager {
	TreeMap<Integer, Student> students;

	public StudentRecordManager() {
		this.students = new TreeMap<Integer, Student>();	
	}

	public void addStudent(int id, String name, double gpa) {
		if (students.containsKey(id)) {
			System.out.println("Student ID already exists");
			return;
		}

		Student newStudent = new Student(name, gpa);
		students.put(id, newStudent);
	}

	public void deleteStudentRecord(int id) {
		students.remove(id);
	}

	public void updateStudentRecord(int id, double newGpa) {
		Student student = students.get(id);

		student.setGpa(newGpa);

		students.put(id, student);
	}

	public void printStudentRecords() {
		
		for (Map.Entry<Integer, Student> student : students.entrySet()) {
			System.out.println(student.getKey() + ": " + student.getValue().getName() + ", " + student.getValue().getGpa());
		}
	}

	public void printStudentsAboveGpa(double thresholdGpa) {
		
		for (Map.Entry<Integer, Student> student : students.entrySet()) {

			if (student.getValue().getGpa() >= thresholdGpa) {
				System.out.println(student.getKey() + ": " + student.getValue().getName() + ", " + student.getValue().getGpa());
			}
		}
	}
}
