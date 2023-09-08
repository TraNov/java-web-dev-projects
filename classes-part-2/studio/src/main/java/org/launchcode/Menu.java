package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    private Date lastUpdate;

    public Menu() {

    }

    public void addItem(MenuItem item) {
        this.menuItems.add(item);
    }

    public void removeItem(MenuItem item) {
        this.menuItems.remove(item);
    }

    public void printAllItems() {
        for(int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            item.print();
        }
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }
}
