package Foot2Door;

import java.util.List;

public class HealthyShop implements Producer{
    private String nameOfProducer = "Healthy Shop";
    private Product product = new Product("Zdrowe kiwi",30);
    private int quantity = 100;

    @Override
    public ProducerDto info() {
        return new ProducerDto(nameOfProducer,product,quantity);
    }
    @Override
    public OrderDto process(List<Order> orderList, ProducerDto producerDto) {

            for (Order o : orderList) {
                if (o.getProduct().getNameOfProduct().equals(producerDto.getProduct().getNameOfProduct())
                        && o.getQuantityOfOrder() <= producerDto.getQuantity())
                    return new OrderDto(o, true);


            }
        return new OrderDto(null,false);
    }
}


