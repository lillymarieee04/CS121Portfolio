package packageDemo;

// StudentTest.java
public class StudentTest {
    public static void main(String[] args) {
        // Your code here
        Student student = new Student();
        student.setStudentID("9999");
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setGradeLevel(3);
        student.setGPA(3.75);

        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Grade Level: " + student.getGradeLevel());
        System.out.println("GPA: " + student.getGPA());
    }
}


