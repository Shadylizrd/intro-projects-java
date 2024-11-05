public class MainNine {
    public static void main(String[] args) {
        StoreEight lemonadeStand = new StoreEight("Lemonade", 3.75);
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);
      }
}
