public abstract class CardPayment extends Payment {
    @Override
    void payment(float amount) {
        System.out.println("This is card Payment.");
        System.out.println("Payment gateway is not integrated Yet.");
        System.out.println("But after implementation you can complete payment.");
        System.out.println("--------------------------------------------------");
        System.out.println("You will be charge " + amount + "$ for this purchase.");
    }
}
