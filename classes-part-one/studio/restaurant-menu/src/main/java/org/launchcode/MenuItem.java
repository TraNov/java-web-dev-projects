package org.launchcode;

public class MenuItem {
    protected double price;
    protected String desc;
    protected String category;
    protected boolean newItem = true;

    public MenuItem(double price, String desc, String category) {
        this.price = price;
        this.desc = desc;
        this.category = category;
    }

    public double getPrice() {

        return price;
    }

    public String getCategory() {

        return category;
    }

    public String getDesc() {

        return desc;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public void setDesc(String desc) {

        this.desc = desc;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }
}