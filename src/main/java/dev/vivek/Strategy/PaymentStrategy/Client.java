package dev.vivek.Strategy.PaymentStrategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.pay(100, PaymentType.CreditCard);
        shoppingCart.pay(200, PaymentType.DebitCard);
        shoppingCart.pay(300, PaymentType.UPI);
    }
}
