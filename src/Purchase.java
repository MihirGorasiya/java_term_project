import java.util.ArrayList;
import java.util.List;

public class Purchase {
    List<Integer> cartItemIndexes;

    Purchase() {
        cartItemIndexes = new ArrayList<>();
    }
    float purchaseTotal = 0.0f;

    public float getPurchaseTotal(){
        return purchaseTotal;
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
    }
}
