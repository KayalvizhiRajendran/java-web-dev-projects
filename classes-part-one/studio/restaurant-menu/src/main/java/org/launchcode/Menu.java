package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {
    public HashMap<String, ArrayList<MenuItem>> menuItems = new HashMap<>();
    private ArrayList<String> categories;
    private Date lastUpdated;

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addMenuItem(String category, MenuItem item) {
        ArrayList<MenuItem> selectedItem = menuItems.get(category);
        if(selectedItem != null) {
            selectedItem.add(item);
            menuItems.put(category, selectedItem);
        } else {
            selectedItem = new ArrayList<MenuItem>();
            selectedItem.add(item);
            menuItems.put(category, selectedItem);
        }
    }

    public HashMap<String, ArrayList<MenuItem>> getMenuItems() {
        return menuItems;
    }
}
