public class Student {
    private int studentID;
    private String name;
    private ReportCard reportCard = new ReportCard();
    private static int numberOfStudents;
    {
        numberOfStudents++;
    }


    public Student() {
        reportCard = new ReportCard();
    }

    // Creating a student class with id and name as a attributes
    public Student(String name, int studentID) {
        this();
        this.name =name;
        this.studentID = numberOfStudents;
        //numberOfStudents++;
    }

    public int getStudentID() {
        return studentID;
    }

    public ReportCard getReportCard() {
        return reportCard;
    }

    // display() method to display the student data
    public void display()
    {
        System.out.println("Student name is: " + name);
    }
}
