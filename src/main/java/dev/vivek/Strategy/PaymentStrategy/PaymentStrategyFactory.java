package dev.vivek.Strategy.PaymentStrategy;

public class PaymentStrategyFactory {
    static CreditCardStrategy creditCardStrategy = new CreditCardStrategy("Vivek", "1234567890123456", "123", "12/24");
    static DebitCardStrategy debitCardStrategy = new DebitCardStrategy("Vivek", "1234567890123456", "123", "12/24");
    static UPIStrategy upiStrategy = new UPIStrategy("vivek@upi", "1234567890");
    public static PaymentStrategy getPaymentStrategy(PaymentType paymentType) {
        switch (paymentType) {
            case CreditCard:
                return creditCardStrategy;
            case DebitCard:
                return debitCardStrategy;
            case UPI:
                return upiStrategy;
            default:
                return null;
        }
    }
}
