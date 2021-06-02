public class ReportCard {
    private static int[] grades = new int[11];
    private int numberOfGrades;
    private double averageGrades;


    public int[] getGrades(int[] grades) {
        return ReportCard.grades;
    }

    //we are adding A grade (not numerous grades)
    //parameter should be a grade
    public void addGrade(int grades) {
        numberOfGrades += 1;
        for (int i = 0; i < ReportCard.grades.length; i++) {
            //if a student is not in null array
            if (ReportCard.grades[i] == 0) {
                //the student will be inserted into array
                ReportCard.grades[i] = grades;
                break;
            }
        }
    }
    //anytime we have a problem with the method having a red line next to the method
    //eliminate the
    public static double getAverageGrade() {
        //... to allow method accept a variable amount of parameter
        //we are taking value of the array and we are doing something
        int total = 0;
        double avg = 0;
        for (int element : grades) {
            //to get total number from all numbers from array
            total += element;
            if (grades.length != 0) {
                //values.length will count all the numbers that are present in the array
                avg = total / grades.length;
            }
        }
        return avg;
    }
}
