import java.util.Collection;
import java.util.Collections;

public class Cart extends Purchase {
    public void addCartItems(int id) {
        cartItemIndexes.add(id);
    }

    public void displayAllProductIds() {
        System.out.println("\nAll products in cart");
        IndividualProduct individualProduct = new IndividualProduct();
        purchaseTotal = 0;
        for (int i : cartItemIndexes) {
            individualProduct.id = i;
            purchaseTotal += individualProduct.getItemPrice();
            System.out.println(i + "\t\t" + individualProduct.getItemName() + "\t\t" + individualProduct.getItemPrice());
        }
        System.out.println("-------------------------------------------------------");
        System.out.println(" \t\t\t\t\t\t\t\t" + purchaseTotal);
        float discount = calculateDiscount();
        System.out.println("-------------------------------------------------------");
        System.out.println("Discount: \t\t\t\t\t\t-" + discount);
        purchaseTotal = purchaseTotal - discount;
        System.out.println(" \t\t\t\t\t\t\t\t" + purchaseTotal);
    }

    public float calculateDiscount() {
        Collections.sort(cartItemIndexes);
        IndividualProduct individualProduct = new IndividualProduct();

        int currentIndex = cartItemIndexes.get(0);
        float discount = 0.0f;
        for (int i = 0; i < cartItemIndexes.size(); i++) {
            individualProduct.id = cartItemIndexes.get(i);

            if (cartItemIndexes.get(i) == currentIndex) {
                discount += individualProduct.getItemDiscount();
            } else {
                currentIndex = cartItemIndexes.get(i);
            }
        }

        return discount;
    }
}
