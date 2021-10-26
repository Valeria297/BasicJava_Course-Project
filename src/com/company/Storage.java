package com.company;

import com.company.Cars.Car;
import com.company.Cars.CarBMW;

import java.util.ArrayList;

public class Storage {
    protected ArrayList<Object> storage = new ArrayList<>();

    public void storage() {
        System.out.println("Storage: " + storage);
    }

    public void addStorage(Object object) {
        storage.add(object);
    }

    public void deleteFromStorage(Object object) {
        Object ob = new Object();
        for (Object ob1 : storage) {
            if (ob1.equals(object)) {
                ob = ob1;
            }
        }
        storage.remove(ob);
    }

    public Object checkCar(Car car) {
        Object ob = new CarBMW();

        for (int i = 0; i < storage.size(); i++) {
            if (!car.compareCars(car, storage.get(i))) {
                storage.add(car);
                return false;
            } else {
                ob = storage.get(i);
            }
        }
        return ob;
    }

}
