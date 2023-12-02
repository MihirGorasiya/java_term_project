import java.math.RoundingMode;
import java.text.DecimalFormat;

public abstract class CashPayment extends Payment {
    private static final DecimalFormat df = new DecimalFormat("0.0");

    @Override
    void payment(float amount) {
        float finalAmount = 0.0f;

        df.setRoundingMode(RoundingMode.UP);
        finalAmount = Float.parseFloat(df.format(Double.parseDouble(String.valueOf(amount))));

        System.out.println("\nThis is cash Payment.");
        System.out.println("Payment gateway is not integrated Yet.");
        System.out.println("But after implementation you can complete payment.");
        System.out.println("--------------------------------------------------");
        System.out.println("You will be charge " + finalAmount + "$ for this purchase.");
    }
}
