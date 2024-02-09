package Foot2Door;

import java.util.ArrayList;
import java.util.List;

public class EndOfOrder {

    public static void endOfOrder() {
        OrderRetriever orderRetriever = new OrderRetriever();
        List<Order> orderList = orderRetriever.order();

        List<OrderDto> orderDtoList = new ArrayList<>();
        orderDtoList.add(new ExtraFoodShop().process(orderList, new ExtraFoodShop().info()));
        orderDtoList.add(new GlutenFreeShop().process(orderList, new GlutenFreeShop().info()));
        orderDtoList.add(new HealthyShop().process(orderList,new HealthyShop().info()));
        int counter=1;

            for(OrderDto o:orderDtoList) {

                if (o.isOrderCompleted()) {

                    System.out.println("Order " +counter+":  The order of product: " + o.getOrder().getProduct().getNameOfProduct()  + "\nin quantity: "
                            + o.getOrder().getQuantityOfOrder() + "\nfor " + o.getOrder().getSumOfMoney() + " dollars is COMPLETED");
                } else
                    System.out.println("Order " +counter+":  Sorry, we can't realise your order :(");
                counter++;
            }
        }
    }


