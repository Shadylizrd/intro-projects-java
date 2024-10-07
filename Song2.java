/* 
Task explaining how Strings are objects and therefore cannot be compared
using "primitive" comparison operators like "==" and instead you use .equals()
*/

public class Song2 {
    public static void main(String[] args) {
        String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        
        // Checking whether line1 and line2 hold the same data
        System.out.println(line1.equals(line2));
        
        // Checking whether line2 and line3 hold the same data
        System.out.println(line2.equals(line3));

    }
}
