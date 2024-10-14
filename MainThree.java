public class MainThree {
   public static void main(String[] args) {
    StoreThree cookieShop = new StoreThree("cookies", 12, 3.75);
    System.out.println("The new store sells "+cookieShop.productType+". There are "+cookieShop.inventoryCount+" of the product and it costs £"+cookieShop.inventoryPrice);
   }
}
