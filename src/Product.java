import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Product {

    private final List<JSONObject> items = new ArrayList<>();

//    items getter
    public List<JSONObject> getAllItems(){
        return items;
    }

    Product(){
        retrieveData();
    }

// Retrieving all data from JSON file and storing in Variable
    private void retrieveData() {
        try {
            JSONParser parser = new JSONParser();
            String filePath = "src/products.json";
            JSONObject data = (JSONObject) parser.parse(new FileReader(filePath));
//          new FileReader("D:/FSDT/supprimer/3464 (Java)/term_project/src/products.json"));

            JSONArray jsonArray = (JSONArray) data.get("products");
            for (Object o : jsonArray) {
                items.add((JSONObject) o);
            }
        } catch (IOException | ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getTotalItemCount(){
        if(items.isEmpty())
            retrieveData();
        return items.size();
    }
//  It shows list of all products to client as Menu
    public void printProductList() {
        for (JSONObject o : items) {
            String id = o.get("id").toString();
            String name = o.get("name").toString();
            String price = o.get("price").toString();
            String discount = o.get("discount").toString();

            System.out.println(id + "\t\t" + name + "\t\t" + price);
        }
    }

}


