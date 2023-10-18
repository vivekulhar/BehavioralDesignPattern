package dev.vivek.Observer.InventoryManagement;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        InventoryManagement inventoryManagement = new InventoryManagement(publisher);
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(publisher);
        NotifySeller notifySeller = new NotifySeller(publisher);


        publisher.orderPlaced();

        publisher.unregisterPlacedOrderSubscriber(inventoryManagement);

        publisher.orderPlaced();

        publisher.unregisterPlacedOrderSubscriber(invoiceGenerator);

        publisher.orderPlaced();

        publisher.unregisterPlacedOrderSubscriber(notifySeller);
    }
}
