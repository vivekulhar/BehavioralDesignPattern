package dev.vivek.Strategy.PaymentStrategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {

    }

    public void pay(int amount, PaymentType paymentType){
        paymentStrategy = PaymentStrategyFactory.getPaymentStrategy(paymentType);
        paymentStrategy.pay(amount);
    }
}
