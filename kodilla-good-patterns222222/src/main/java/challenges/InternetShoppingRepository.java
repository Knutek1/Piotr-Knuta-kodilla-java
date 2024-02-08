package challenges;

public class InternetShoppingRepository implements ShoppingRepository {
    public void createPurchase(User user, Product product){
        System.out.println("The purchase was sent to repository ");
    }
}
