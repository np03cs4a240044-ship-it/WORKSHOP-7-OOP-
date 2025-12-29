package workshop7;

public class GradeCalculator {

    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


    public static void main(String[] args) {

        System.out.println("\nExample scores and their grades:");
        System.out.println("100 points = " + getGrade(100));
        System.out.println("75 points = " + getGrade(75));
        System.out.println("65 points = " + getGrade(65));
        System.out.println("45 points = " + getGrade(45));
    }
}
