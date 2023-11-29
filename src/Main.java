import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        IndividualProduct i = new IndividualProduct();
        Cart cart = new Cart();
        Payment payment = new Payment() {
            @Override
            void payment() {}
        };
        CardPayment cardPayment = new CardPayment() {
            @Override
            void payment() {
                super.payment();
            }
        };
        CashPayment cashPayment = new CashPayment() {
            @Override
            void payment() {
                super.payment();
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

        //TODO: implement payment select method
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

        //TODO: make payment
        if(payment.getPaymentMethod() == 0)
            cardPayment.payment();
        else
            cashPayment.payment();



//        System.out.println();
//        i.id = 2;
//        System.out.println(i.id);
//        System.out.println(i.getItemName());
//        System.out.println(i.getItemPrice());
//        System.out.println(i.getItemDiscount());
    }
}