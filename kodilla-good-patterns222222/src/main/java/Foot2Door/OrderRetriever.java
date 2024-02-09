package Foot2Door;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class OrderRetriever {
    List <Order> orderList = new ArrayList<>();
    public List<Order> order(){
        orderList.add(new Order(new Product("Ekstra czekoladki",99.50),12,12*99.50));
        orderList.add(new Order(new Product("Bezglutenowe bagiety",25),100,100*25));
        orderList.add(new Order(new Product("Zdrowe Banany",30),1000,1000*30));

                return orderList;
    }
}
