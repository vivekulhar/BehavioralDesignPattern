package dev.vivek.Observer;

public class InventoryManagement implements OrderPlacedSubscriber, OrderCancelledSubscriber{
    @Override
    public void onOrderPlaced() {
        System.out.println("Inventory updated");
    }

    @Override
    public void onOrderCancelled() {
        System.out.println("Order cancelled");
    }
}
