import org.json.simple.JSONObject;

public class IndividualProduct extends Product {
    int id = 0;
    public JSONObject getItemById(){
        return getAllItems().get(id);
    }
    public String getItemName(){
        return getItemById().get("name").toString();
    }
    public Double getItemPrice(){
        return Double.parseDouble(getItemById().get("price").toString());
    }
    public Double getItemDiscount(){
        return Double.parseDouble(getItemById().get("discount").toString());
    }
}
