package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box();
        box1.getBoxType(2,3);

        Box box2 = new Box(3);
        box2.getBoxType(3);

        Box box3 = new Box(1,6,7);
        box3.getBoxType (1,6,7);

        Box box4 = new Box(6,6,6);
        box4.getBoxType(6,6,6);

    }
}
