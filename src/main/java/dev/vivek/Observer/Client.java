package dev.vivek.Observer;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        InventoryManagement inventoryManagement = new InventoryManagement();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        NotifySeller notifySeller = new NotifySeller();

        publisher.registerPlacedOrderSubscriber(inventoryManagement);
        publisher.registerPlacedOrderSubscriber(invoiceGenerator);
        publisher.registerPlacedOrderSubscriber(notifySeller);

        publisher.orderPlaced();

        publisher.unregisterPlacedOrderSubscriber(inventoryManagement);

        publisher.orderPlaced();

        publisher.unregisterPlacedOrderSubscriber(invoiceGenerator);

        publisher.orderPlaced();

        publisher.unregisterPlacedOrderSubscriber(notifySeller);
    }
}
