package com.company.Enums;

public enum EngineVolumes{
    XX3(Models.BMW),
    XX4(Models.BMW),
    XX5(Models.BMW),
    JE3(Models.JEEP),
    JE4(Models.JEEP),
    JE7(Models.JEEP),
    AJ02(Models.JAGUAR),
    AJ03(Models.JAGUAR),
    AJ05(Models.JAGUAR);

    private Models model;

    EngineVolumes(Models model) {
        this.model = model;
    }

    public EngineVolumes [] getEngineVolumes (Models model){
        EngineVolumes [] engineVolumes = new EngineVolumes[10];

        for (int i = 0, j = 0; i < EngineVolumes.values().length; i++, j++){
            if (EngineVolumes.values()[i].model == this.model){
                engineVolumes[j] = EngineVolumes.values()[i];
                j++;
            }
        }
        return engineVolumes;
    }
}
