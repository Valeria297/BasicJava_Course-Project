package com.company.Enums;

import java.util.Arrays;

public enum Models {
    JEEP,
    BMW,
    JAGUAR;

    public void getAllModels() {
        System.out.println(Arrays.toString(Models.values()));
    }

}
