package dev.vivek.Observer;

public class NotifySeller implements OrderPlacedSubscriber {
    @Override
    public void onOrderPlaced() {
        System.out.println("Seller notified");
    }
}
