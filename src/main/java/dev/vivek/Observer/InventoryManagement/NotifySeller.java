package dev.vivek.Observer.InventoryManagement;

public class NotifySeller implements OrderPlacedSubscriber {
    Publisher publisher;

    public NotifySeller(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.registerPlacedOrderSubscriber(this);
    }
    @Override
    public void onOrderPlaced() {
        System.out.println("Seller notified");
    }
}
