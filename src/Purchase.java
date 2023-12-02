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
}
