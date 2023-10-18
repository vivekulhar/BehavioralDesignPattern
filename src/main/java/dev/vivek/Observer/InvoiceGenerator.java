package dev.vivek.Observer;

public class InvoiceGenerator implements OrderPlacedSubscriber, OrderCancelledSubscriber {
    @Override
    public void onOrderPlaced() {
        System.out.println("Invoice generated");
    }

    @Override
    public void onOrderCancelled() {
        System.out.println("Invoice cancelled");
    }
}
