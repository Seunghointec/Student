public class ReportCard {
    //we created instance variable which are private
    //private is only accessible for ReportCard (i.e own) class.
    private int[] grades = new int[10];
    private int numberOfGrades=0;

    //We do not have constructor with parameters.
    //However we do have a default constructor.
    //Therefore we can create a new object of ReportCard.

 /*   Setters of the grades not needed for two reasons
       1. grades are added using the addGrade method
       2. constructor with parameter are not used.
           a. because we are already adding grade and getting grades and average using method.
           b. like student class, we could construct constructor like this
       3. The problem with the creating constructor of array is that
            a. we need to create an array object
            b. everytime we create an object of reportCard.
            c. the code can be repetitive and complicated. */

    /*    If we are creating constructor with an array we have two problems
            1. we already initialized my element line 4.
            2. ReportCard object was created and the expect parameter value in te new object is array.
            3. This array parameter becomes unnecessary because reportCard object wll ask for grade
            4. because reportCard object wll ask for addGrade and getGrade.
                a. we already recalled methods and loop to recall array parameter
                b. this becomes duplicate of code
                c. either create a constructor with an array or create a method
            5. Remember, when we use constructor, we are setting initial values in constructor
    public ReportCard(int grade) {
        this.grades = grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }*/

    //getter are returning value (array)
    //when this method is recalled, the returned array will be applied to statement
    public int[] getGrades() {
        return grades;
    }

    //we are adding A grade (not numerous grades)
    //parameter should be a grade
    public int addGrade(int grade) {
        //we cannot divide by 0
        numberOfGrades += 1;
        for (int i = 0; i < grades.length; i++) {
            //if a student is not in null array
            if (grades[i] == 0) {
                //the student will be inserted into array
                grades[i] = grade;
                break;
            }
        }
        return grade;
    }
    //anytime we have a problem with the method having a red line next to the method
    //eliminate the curly bracket
    //make sure you know what static method is doing
    public double getAverageGrade() {
        //... to allow method accept a variable amount of parameter
        //we are taking value of the array and we are doing something
        double total = 0;
        double avg = 0;
        for (int element : grades) {
            //to get total number from all numbers from array
            total += element;
            if (numberOfGrades !=0) {
                //values.length will count all the numbers that are present in the array
                //int[] grades = new int[10] means there will be 10 grades.length
                //either add 10 grades or change to numberOfGrades variable
                avg = total / numberOfGrades;
            }
        }
        System.out.println(total);
        return avg;
    }
}


/* public class ClassHowToDeclareArray{
    public static void main(String args[]) {

        // Declaring an array of student
        ReportCard[] reportCard;

        // Allocating memory for 2 objects of type student
        reportCard = new ReportCard[2];

        // Initializing the first element of the array
        reportCard[0] = new ReportCard(70);

        // Initializing the second element of the array
        reportCard[1].addGrade((int) Math.random() * 100);

        // Displaying the student data
        System.out.println("Student data in student arr 0: ");
        reportCard[0].display();

        System.out.println("Student data in student arr 1: ");
        reportCard[1].display();
    }
    public void display()
    {
        System.out.println("Report card is: " + grades);
    }
} */



