package dev.vivek.Observer.InventoryManagement;

public class InventoryManagement implements OrderPlacedSubscriber, OrderCancelledSubscriber{
    Publisher publisher;

    public InventoryManagement(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.registerPlacedOrderSubscriber(this);
    }
    @Override
    public void onOrderPlaced() {
        System.out.println("Inventory updated ");
    }

    @Override
    public void onOrderCancelled() {
        System.out.println("Order cancelled ");
    }
}
