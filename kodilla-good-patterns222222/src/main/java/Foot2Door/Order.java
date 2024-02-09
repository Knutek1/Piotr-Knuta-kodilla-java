package Foot2Door;

public class Order {
    Product product;
    int quantityOfOrder;
    double sumOfMoney;

    public Order(Product product, int quantityOfOrder, double sumOfMoney) {
        this.product = product;
        this.quantityOfOrder = quantityOfOrder;
        this.sumOfMoney = sumOfMoney;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantityOfOrder() {
        return quantityOfOrder;
    }

    public double getSumOfMoney() {
        return sumOfMoney;
    }
}
