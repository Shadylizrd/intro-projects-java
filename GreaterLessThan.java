// Task explaining relational operators for numeric datatypes for making boolean comparisons
public class GreaterLessThan {
    public static void main(String[] args) {
        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;

        // using a logic operator to output whether the person has enough credits to graduate
        System.out.print("Enough credits to graduate: ");
        System.out.println(creditsEarned>creditsToGraduate);
        
        // checking whether the credits are enough after attending a seminar
        System.out.print("Enough credits to graduate after seminar: ");
        System.out.println(creditsEarned+creditsOfSeminar>creditsToGraduate);

    }
}
