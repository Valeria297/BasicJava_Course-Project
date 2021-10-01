package com.company.Enums;

public enum WheelSize {
    X55(Models.BMW),
    X60(Models.BMW),
    X70(Models.BMW),
    YJ50(Models.JEEP),
    YJ60(Models.JEEP),
    YJ70(Models.JEEP),
    Z40(Models.JAGUAR),
    Z60(Models.JAGUAR),
    Z50(Models.JAGUAR);

    private Models model;

    WheelSize(Models model) {
        this.model = model;
    }

    public WheelSize [] getWheelSize (Models model){
        WheelSize [] wheelSizes = new WheelSize[10];

        for (int i = 0, j = 0; i < WheelSize.values().length; i++){
            if (WheelSize.values()[i].model == model){
                wheelSizes[j] = WheelSize.values()[i];
                j++;
            }
        }
        return wheelSizes;
    }

}
