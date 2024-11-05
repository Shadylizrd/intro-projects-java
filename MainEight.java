public class MainEight {
    public static void main(String args[]) {
    StoreSeven lemonadeStand = new StoreSeven("Lemonade", 3.75);
    lemonadeStand.increasePrice(1.50);
    System.out.println(lemonadeStand.price);
    }
}
