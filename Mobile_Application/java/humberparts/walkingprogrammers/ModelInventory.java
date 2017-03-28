package humberparts.walkingprogrammers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Ash on 2016-11-13.
 */

public class ModelInventory {
    private LinkedList<ModelInventory> inventories;
    private String id;
    private String name;
    private String stocks;
    private HashMap<String, Object> value;

    public void setParts(HashMap<String, Object> parts) {
        inventories = new LinkedList<>();

        for(Map.Entry<String, Object> part : parts.entrySet()) {
            String key = part.getKey();

            ModelInventory itemPart = new ModelInventory();
            itemPart.setName(key);

            value = (HashMap<String, Object>) part.getValue();

            for (Map.Entry<String, Object> item : value.entrySet()) {
                String itemKey = item.getKey();

                if (itemKey.equals("id")) {
                    itemPart.setId(item.getValue().toString());
                }
                if (itemKey.equals("in stock")) {
                    itemPart.setStocks(item.getValue().toString());
                }
                if (itemKey.equals("name")) {
                    itemPart.setName(item.getValue().toString());
                }
            }

            inventories.add(itemPart);
        }
    }

    public LinkedList<ModelInventory> getParts() {
        return this.inventories;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStocks() {
        return stocks;
    }

    public void setStocks(String stocks) {
        this.stocks = stocks;
    }
}
