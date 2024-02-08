package challenges;

public class PurchaseProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private ShoppingRepository shoppingRepository;


    public PurchaseProcessor(InformationService informationService, OrderService orderService, ShoppingRepository shoppingRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.shoppingRepository = shoppingRepository;
    }

    public PurchaseDto process(final ProductRequest productRequest) {
        boolean isBought = orderService.buy(productRequest.getUser(), productRequest.getProduct());
        if (isBought) {
            informationService.mailSend(productRequest.getUser(),productRequest.getProduct());
            shoppingRepository.createPurchase(productRequest.getUser(), productRequest.getProduct());
            return new PurchaseDto(productRequest.getUser(), true);
        } else {
            return new PurchaseDto(productRequest.getUser(), false);
        }
    }
}
