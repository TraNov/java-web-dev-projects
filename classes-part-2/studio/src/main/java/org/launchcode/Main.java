package org.launchcode;

import java.util.Date;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem(6.33, "Chicken Wings", "Appetizer");
        MenuItem item2 = new MenuItem(15.99, "Beef Stroganoff", "Main Course");
        MenuItem item3 = new MenuItem(13.55, "Pound Cake", "Dessert");
        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        //
        System.out.println("------");
        System.out.println("PrintAll");
        System.out.println("------");
        menu.printAllItems();
        //
        System.out.println("------");
        System.out.println("PrintItem1");
        System.out.println("------");
        item1.print();
        //
        System.out.println("------");
        System.out.println("Remove Item 3");
        System.out.println("------");
        menu.removeItem(item3);
        menu.printAllItems();
    }

}
