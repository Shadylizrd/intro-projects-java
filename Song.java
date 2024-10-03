public class Song {
    public static void main(String[] args) {
        // This line allows you to include quotation marks in a string
        System.out.println("\"Hello World\"");
        // the "\" is being used here to cancel out the function of a backslash so you can include it in the string
        System.out.println("This is a backslash symbol: \\");
        // \n creates a new line for any text afterwards
        System.out.println("Hello\nGoodbye");
        // \b removes the character behind it
        System.out.println("Hello\bGoodbye");
        // \t creates the amount of space the tab button does inbetween the two sides
        System.out.println("Hello\tGoodbye");
        // \r only outputs the second half of the string
        System.out.println("Hello\rGoodbye");
        // Creating a String object
        String openingLyrics = new String("Yesterday, all my troubles seemed so far away");
        System.out.println(openingLyrics);
    }
}
