public class StoreSix {
    // instance fields
    String productType;

    // constructor method
    public StoreSix(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // greet customer method
    public void greetCustomer(String customerName) {
            System.out.println("Welcome to the store, "+customerName+"!");
    }

}
