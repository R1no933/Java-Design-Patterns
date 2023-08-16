package patterns.behavioral_patterns.strategy;

public class PaypalStrategy implements PaymentStrategy {

    private String emailID;
    private String password;

    public PaypalStrategy(String emailID, String password) {
        this.emailID = emailID;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid usind paypal.");
    }
}
