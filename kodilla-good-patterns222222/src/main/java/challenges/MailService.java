package challenges;

public class MailService implements InformationService{
    @Override
    public void mailSend(User user, Product product) {
        System.out.println("The confirmation of buing "+ product.getNameOfTheProduct()+ " was sent to: " +user.getUsername());
    }
}
