import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        IndividualProduct i = new IndividualProduct();
        Cart cart = new Cart();
        Payment payment = new Payment() {
            @Override
            void payment(float amount) {}
        };
        CardPayment cardPayment = new CardPayment() {
            @Override
            void payment(float amount) {
                super.payment(amount);
            }
        };
        CashPayment cashPayment = new CashPayment() {
            @Override
            void payment(float amount) {
                super.payment(amount);
            }
        };

        i.printProductList();
        int paymentMethod = 0;

        System.out.println("\npress any character to end shopping.");
        int input = -1;
        do {
            try {
                System.out.print("Enter index of product: ");
                input = s.nextInt();
                if(input < i.getTotalItemCount())
                    cart.addCartItems(input);
            } catch (Exception e) {
                input = -1;
            }
        } while (input >= 0 && input < i.getTotalItemCount());

        cart.displayAllProductIds();

        //TODO: add cart update functionality (optional)


        System.out.println("\nPlease select payment method");
        System.out.println("press 0 for card payment.");
        System.out.println("press 1 for cash payment.");
        System.out.println("\nselect Payment method: ");
        try{
            s = new Scanner(System.in);
            paymentMethod = s.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        payment.setPaymentMethod(paymentMethod);

        if(payment.getPaymentMethod() == 0)
            cardPayment.payment(cart.getPurchaseTotal());
        else
            cashPayment.payment(cart.getPurchaseTotal());
    }
}