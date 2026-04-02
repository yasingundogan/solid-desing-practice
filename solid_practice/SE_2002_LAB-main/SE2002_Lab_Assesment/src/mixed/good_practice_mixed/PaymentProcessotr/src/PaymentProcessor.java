public class PaymentProcessor {

    private IPayment gateway;
    private Logger logger;

    public PaymentProcessor(IPayment gateway, Logger logger) {
        this.gateway = gateway;
        this.logger = logger;
    }

    public void pay(double amount) {
        gateway.pay(amount);
        logger.log("Paid: " + amount);
    }
}