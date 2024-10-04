package org.launchcode;

import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private Date dateAdded;

    public MenuItem(String name, String description, double price, Date dateAdded) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.dateAdded = dateAdded;
    }

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.dateAdded = new Date();
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
