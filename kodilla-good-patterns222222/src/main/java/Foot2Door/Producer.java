package Foot2Door;

import java.util.List;

public interface Producer {
    ProducerDto info();
    OrderDto process(List<Order> orderList, ProducerDto producerDto);
}
