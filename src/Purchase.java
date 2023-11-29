import java.util.ArrayList;
import java.util.List;

public class Purchase {
    List<Integer> cartItemIndexes;

    Purchase() {
        cartItemIndexes = new ArrayList<>();
    }

    public void displayAllProductIds() {
        System.out.println("\nAll products in cart");
        IndividualProduct individualProduct = new IndividualProduct();
        double total = 0;
        for (int i : cartItemIndexes) {
            individualProduct.id = i;
            total += individualProduct.getItemPrice();
            System.out.println(i + "\t\t" + individualProduct.getItemName() + "\t\t" + individualProduct.getItemPrice());
        }
        System.out.println("-------------------------------------------------------");
        System.out.println(" \t\t\t\t\t\t\t\t" + total);
    }
}
