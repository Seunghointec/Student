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
}
