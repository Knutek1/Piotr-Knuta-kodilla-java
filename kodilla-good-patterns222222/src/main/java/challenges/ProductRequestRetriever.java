package challenges;

public class ProductRequestRetriever {
    public ProductRequest retrieve(){
        User user1 = new User("Cuathemoc","Blanco","CuaBla");
        Product product1 = new Product("Earings",2399.99);
        return new ProductRequest(user1,product1);
    }
}
