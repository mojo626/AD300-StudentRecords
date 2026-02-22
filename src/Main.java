
class Main {
    public static void main(String[] args) {

		StudentRecordManager manager = new StudentRecordManager();

		manager.addStudent(1, "Joe", 4.0);
		manager.addStudent(3, "Alice", 4.0);
		manager.addStudent(5, "Bill", 3.2);
		manager.addStudent(4, "Jim", 2.7);
		manager.addStudent(2, "Rose", 3.6);
		manager.addStudent(2, "Duplicate", 4.0);


		System.out.println("Student records:");
		manager.printStudentRecords();

		manager.updateStudentRecord(4, 2.8);

		System.out.println("Updated gpa:");
		manager.printStudentRecords();

		manager.deleteStudentRecord(1);

		System.out.println("Deleted record:");
		manager.printStudentRecords();

		System.out.println("Above gpa of 3.0:");
		manager.printStudentsAboveGpa(3.0);
    }
}
