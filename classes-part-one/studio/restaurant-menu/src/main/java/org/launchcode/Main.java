package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MenuItem one = new MenuItem(5.00, "Chalupa Box", "Main Course");
        MenuItem two = new MenuItem(5.00, "Chicky Nuggies", "Main Course");
        MenuItem three = new MenuItem(8.99, "an american classic", "entree");

        Menu menuOne = new Menu();
        //System.out.println(menuOne);
        System.out.println(menuOne.getLastUpdated());
        System.out.println(menuOne.getMenuItems());

        ArrayList<MenuItem> list = new ArrayList<MenuItem>();
        list.add(one);
        list.add(two);
      //  list.add(three);
        Menu menuTwo = new Menu(list);
        System.out.println(menuTwo.getLastUpdated());
        System.out.println(menuTwo.getMenuItems());


    }
}