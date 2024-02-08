package challenges;

public class ProductOrderService implements OrderService{
    public boolean buy(User user, Product product){
        System.out.println("The product: "+product.getNameOfTheProduct()+ " is bought by: "+user);
        return true;
    };

}
