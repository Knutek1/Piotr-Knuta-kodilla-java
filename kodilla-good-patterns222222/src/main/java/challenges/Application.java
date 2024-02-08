package challenges;

public class Application {
    public static void main(String[] args) {
        ProductRequestRetriever productRequestRetriever = new ProductRequestRetriever();
        ProductRequest productRequest = productRequestRetriever.retrieve();

        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new MailService(), new ProductOrderService(), new InternetShoppingRepository());
        purchaseProcessor.process(productRequest);
    }
}
