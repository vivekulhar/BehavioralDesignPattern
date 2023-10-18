package dev.vivek.Observer.InventoryManagement;

public class InvoiceGenerator implements OrderPlacedSubscriber, OrderCancelledSubscriber {
    Publisher publisher;

    public InvoiceGenerator(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.registerPlacedOrderSubscriber(this);
    }
    @Override
    public void onOrderPlaced() {
        System.out.println("Invoice generated");
    }

    @Override
    public void onOrderCancelled() {
        System.out.println("Invoice cancelled");
    }
}
