public class StoreSeven {
    // instance fields
    String productType;
    public double price;

    // constructor method
    public StoreSeven(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
        // could also just be written as price += priceToAdd
    }


}
