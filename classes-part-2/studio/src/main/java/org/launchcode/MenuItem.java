package org.launchcode;

public class MenuItem {
    private Double price;
    private String description;
    private String category;

    private boolean isNew = false;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public String toString() {
        String newString = this.isNew ? "- NEW!" : "";
        return String.format("Category: %s, Description: %s, Price: %.2f %s", this.category, this.description, this.price, newString);
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        MenuItem item = (MenuItem) toBeCompared;
        return this.getCategory() == item.getCategory() && this.getPrice() == item.getPrice() && this.getDescription() == item.getDescription();
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

}
