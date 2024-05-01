package packagetesterpackage;
import personpackage.*;


public class PackageTester {
	 public static void main(String[] args) {
	        Student student = new Student("John", 20, 12345, "Computer Science");
	        Teacher teacher = new Teacher("Mr. Smith", 35, "Mathematics");

	        // Using setters to change fields
	        student.setId(54321);
	        student.setMajor("Electrical Engineering");
	        teacher.setSubject("Physics");

	        // Printing string representations of objects
	        System.out.println("Student: " + student.toString());
	        System.out.println("Teacher: " + teacher.toString());
	    }
}
