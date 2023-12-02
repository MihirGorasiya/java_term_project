import java.text.DecimalFormat;

public abstract class CardPayment extends Payment {
    private static final DecimalFormat df = new DecimalFormat("0.0");

    @Override
    void payment(float amount) {
        System.out.println("\nThis is card Payment.");
        System.out.println("Payment gateway is not integrated Yet.");
        System.out.println("But after implementation you can complete payment.");
        System.out.println("--------------------------------------------------");
        System.out.println("You will be charge " + df.format(amount) + "$ for this purchase.");
    }
}
