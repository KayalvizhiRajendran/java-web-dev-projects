package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
                MenuItem item = new MenuItem("Pancake", "Strawberries, cream, chocolate chips", 10.09);
                MenuItem item2 = new MenuItem("Chicken Biriyani","medium spicy with naan and raitha", 15);
                MenuItem item3 = new MenuItem("Strawberry lemonade","Strawberries with little soda", 5.50);
                MenuItem item4 = new MenuItem("Mango Lassie","Mango with yogurt", 5.50);

                Menu menu = new Menu();
                menu.addMenuItem("Breakfast", item);
                menu.addMenuItem("Main Course", item2);
                menu.addMenuItem("Drink",item3);
                menu.addMenuItem("Drink", item4);
                ArrayList<MenuItem> items;

                for(String key: menu.getMenuItems().keySet()){
                    System.out.println(key+":");
                    items = menu.getMenuItems().get(key);
                    for(int index=0; index < items.size(); index++) {
                        MenuItem item1 = items.get(index);
                        System.out.println(item1.getName()+" "+item1.getDescription()+" "+item1.getPrice());
                    }
                }

    }
}
