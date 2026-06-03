public class Student {

    int studentId;
    String studentName;
    double cgpa;

    public Student(int studentId, String studentName, double cgpa) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.cgpa = cgpa;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {

        Student s1 = new Student(
                101,
                "Ali Khan",
                3.75
        );

        s1.displayStudent();
    }
}