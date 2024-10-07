// Task explaining multiplication and division operators in java
public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
        double tax = 0.0875;
        // Calculating total cost with tax
        double total = subtotal + subtotal*tax;
        // Outputting result
        System.out.println(total);
        
        // Calculating total cost per person
        double perPerson = total/4;
        // Outputting result
        System.out.println(perPerson);
	}
}