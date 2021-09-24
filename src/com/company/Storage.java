package com.company;

import java.util.ArrayList;

public class Storage {
    protected String colour;
    protected Models model;
    protected int yearOfRelease;
    protected WheelSize wheelSize;
    protected EngineVolumes engineVolume;
    ArrayList<Object> storage = new ArrayList<>(100);

    public void storage() {
        System.out.println("Storage: " + storage);
    }

    public void addStorage(Object object) {
        storage.add(object);
    }

    public void deleteFromStorage(Object object1) {
        Object element = new Object();
        for (Object ob : storage) {
            if (ob == object1) {
                element = object1;
            }
        }
        storage.remove(element);
    }
}
