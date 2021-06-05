

public class ClassRoom {
    private static Student[] student = new Student[15];
    private String nameOfClass;
    private final ReportCard reportCard =new ReportCard();


    public ClassRoom() {

    }

    public ClassRoom(String nameOfClass) {
        this();
        this.nameOfClass = nameOfClass;
    }

    public Student[] getStudents() {
        return student;
    }

    //Setting we are using condition.
    //therefore parameter might be required
    public void setStudents(Student[] student) {
        ClassRoom.student = student;
    }

    public static void addStudent(Student student) {
        //add the element you pass in the parameter list to the array.
        //You do this by searching the array for a space where there is no value yet. (0 or null)
        //go through all the null array
        for (int i = 0; i < ClassRoom.student.length; i++) {
            //if a student is not in null array
            if (ClassRoom.student[i] == null) {
                //the student will be inserted into array
                ClassRoom.student[i] = student;
                break;
            }
        }
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public double getClassAverageGrade(int[] reportCard) {
        double totalClassGrade = 0;
        int avgClass = 0;
        //to import
        for (Student student : getStudents()) {
            for (int i = 0; i < reportCard.length; i++) {
                //to get total number from all numbers from array
                totalClassGrade += totalClassGrade + reportCard[i];
                if (reportCard.length != 0) {
                    //values.length will count all the numbers that are present in the array
                    avgClass = (int) (totalClassGrade / getStudents().length);
                }
            }

        }
        return avgClass;
    }
    public void printListOfStudentNames(){
        System.out.println("This classroom is called" + getNameOfClass());
        System.out.println("These are " + getStudents());
    }
}