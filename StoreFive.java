//
public class StoreFive {
    // instance fields
    String productType;
    
    // constructor method
    public StoreFive(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling "+productType+"!";
        System.out.println(message);
    }
}
