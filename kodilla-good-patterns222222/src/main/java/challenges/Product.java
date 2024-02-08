package challenges;
public class Product {
    private String nameOfTheProduct;
    private double price;

    public Product(String nameOfTheProduct, double price) {
        this.nameOfTheProduct = nameOfTheProduct;
        this.price = price;
    }

    public String getNameOfTheProduct() {
        return nameOfTheProduct;
    }

    public double getPrice() {
        return price;
    }
}
