public class BankAPI implements IPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Bank payment " + amount);
    }
}
