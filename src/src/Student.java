public class Student {
    //instance variable creations
    //studentID could be used to count numberOfStudents
    //On the condition that if studentID is not used
    private int studentID;
    private String name;
    private ReportCard reportCard = new ReportCard();
    private int numberOfStudents;
    //initialize instance variable
    {
        numberOfStudents=0;
    }

    //to import
    public Student() {
        reportCard = new ReportCard();
    }

    // Creating a student class with id and name as a attributes
    public Student(String name, int studentID) {
        this();
        this.name =name;
        //this.studentID = numberOfStudents;
        this.studentID = studentID;
        numberOfStudents++;
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
        System.out.println("Student name is: " + name + "\n");
        System.out.println("his/her student ID is" +studentID);
        System.out.println("There are " +numberOfStudents +" student");
    }
}
