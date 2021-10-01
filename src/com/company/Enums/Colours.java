package com.company.Enums;

import java.util.Arrays;

public enum Colours {
    BLACK,
    WHITE,
    RED,
    PURPLE,
    YELLOW,
    GREY,
    BLUE,
    GREEN,
    BROWN,
    ORANGE;

    public void getColours(){
        System.out.println(Arrays.toString(Colours.values()));
    }
}
