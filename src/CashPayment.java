public abstract class CashPayment extends Payment {
    @Override
    void payment() {
        System.out.println("This is cash Payment.");
    }
}
