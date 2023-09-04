package org.launchcode;

import javax.sound.midi.Soundbank;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> MenuItems = new ArrayList<>();

    public Menu() {
        this.lastUpdated = Date.from(Instant.now());
    }

    public Menu(ArrayList<MenuItem> items) {
        this.lastUpdated = Date.from(Instant.now());
        this.MenuItems = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return MenuItems;
    }
}