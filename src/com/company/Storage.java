package com.company;

import com.company.Cars.Car;
import com.company.Enums.Models;

import java.util.ArrayList;

public class Storage {
    protected ArrayList<Object> storage = new ArrayList<>();
    private Models model;

    public void storage() {
        System.out.println("Storage: " + storage);
    }

    public void addStorage(Object object) {
        storage.add(object);
    }

    public Models getModel() {
        return model;
    }

    public boolean containsCar(Object ob) {
        for (int i = 0; i < storage.size(); i++){
           Object storage1 = storage.get(i);
           Models modelTemp = (Models)getModel();

           if (modelTemp.equals(this.model)){
               return (boolean) storage1;
           }
        }
        return false;
    }

}
