

public class Test {
    public static void main(String[] args) {
        //the first thing to do is declare an object and create new object

        ReportCard reportCard =new ReportCard();
        //Line 9; reportCard is a new object
        reportCard.addGrade((int) Math.random()*10);

        System.out.println(reportCard.getAverageGrade()); //output 74.0
        }

}
