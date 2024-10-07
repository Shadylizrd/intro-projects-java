// Task explaining the equality boolean operators
public class EqualNotEqual {
    public static void main(String[] args) {
		int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;
        // variable that checks whether the number of songs in two albums is the same
        boolean numberOfSongs =  songsA == songsB;
        // variable that checks whether the length of two albums is the same 
        boolean differentLength = albumLengthA != albumLengthB;
        System.out.println(numberOfSongs);
        System.out.println(differentLength);
    }
}
