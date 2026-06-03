public class Student {

    int studentId;
    String studentName;
    double cgpa;
    String department;

    public Student(int studentId,
            String studentName,
            double cgpa,
            String department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.cgpa = cgpa;
        this.department = department;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {

        Student s1 =         new Student(
                101,
                "Ali Khan",
                        3.75,
                        "Software Engineering");

        s1.displayStudent();
    }
}