package com.company;

import java.util.ArrayList;

public class Storage {
    ArrayList<Object> storage = new ArrayList<>();

    public void storage() {
        System.out.println("Storage: " + storage);
    }

    public void addStorage(Object object) {
        storage.add(object);
    }
}
