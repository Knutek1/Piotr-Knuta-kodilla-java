package Foot2Door;

public class ProducerDto {
    private String nameOfProducer;
    private Product product;
    private int quantity;

    public ProducerDto(String nameOfProducer, Product product, int quantity) {
        this.nameOfProducer = nameOfProducer;
        this.product = product;
        this.quantity = quantity;
    }

    public String getNameOfProducer() {
        return nameOfProducer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
