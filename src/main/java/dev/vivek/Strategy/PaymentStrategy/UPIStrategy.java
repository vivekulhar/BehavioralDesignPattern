package dev.vivek.Strategy.PaymentStrategy;

public class UPIStrategy implements PaymentStrategy{
    private String upiId;
    private String password;

    public UPIStrategy(String upiId, String password) {
        this.upiId = upiId;
        this.password = password;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using UPI");
    }
}
