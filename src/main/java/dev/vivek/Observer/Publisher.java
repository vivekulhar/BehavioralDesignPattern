package dev.vivek.Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    List<OrderPlacedSubscriber> subscribers = new ArrayList<>();


    void registerPlacedOrderSubscriber(OrderPlacedSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    void unregisterPlacedOrderSubscriber(OrderPlacedSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    void orderPlaced() {
        for (OrderPlacedSubscriber subscriber : subscribers) {
            subscriber.onOrderPlaced();
        }
    }


}
