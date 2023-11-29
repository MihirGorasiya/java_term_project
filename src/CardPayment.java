public abstract class CardPayment extends Payment {
    @Override
    void payment() {
        System.out.println("This is card Payment.");
    }
}
