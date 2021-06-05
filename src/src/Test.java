

public class Test {
    public static void main(String[] args) {
        //the first thing to do is declare an object and create new object (instance of variable)
        ClassRoom classRoom = new ClassRoom();
        Student student = new Student();
        testReportCard();
        testStudent();
    }

    public static void testStudent(){
        //declare instance variable of student
        Student student;
        student = new Student("Jane",735);
        student.display();
    }

    private static void testReportCard () {
        //we can create a new object with array
        //Class obj[]= new Class[array_length]
        ReportCard reportCard = new ReportCard();
        //Line 9; reportCard is a new object
        //to add random numbers into add grades
        //loop allows us to generate 5 numbers
        reportCard.addGrade(5);
        for(int i=0; i<5; i++) {
            //(int) (Math.random() * 10) = generate number from 1 to 10
            reportCard.addGrade((int) (Math.random() * 10));
        }
        //to get grades in array, we need to use loop
        for (int grade : reportCard.getGrades()) {
            //if grade is not equal to 0
            if (grade != 0) {
                System.out.println(grade);
            }
        }
        System.out.println(reportCard.getAverageGrade()); //output 74.0
    }
    @Override
    public String toString() {
        return "Test{}";
    }
}



