package com.company;

public class MonthNumbers {
    String monthName;
    int monthNumber;

    public void getMonthName(int monthNumber) {

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("There is no such month number");
        }
    }


    public void getMonthNumber(String monthName) {
        if (monthName == "January") {
            System.out.println("1");
        } else if (monthName == "February") {
            System.out.println("2");
        } else if (monthName == "March") {
            System.out.println("3");
        } else if (monthName == "May") {
            System.out.println("5");
        } else if (monthName == "April") {
            System.out.println("4");
        } else if (monthName == "June") {
            System.out.println("6");
        } else if (monthName == "Jule") {
            System.out.println("7");
        } else if (monthName == "August") {
            System.out.println("8");
        } else if (monthName == "September") {
            System.out.println("9");
        } else if (monthName == "October") {
            System.out.println("10");
        } else if (monthName == "November") {
            System.out.println("11");
        } else if (monthName == "December") {
            System.out.println("12");
        }
    }
}
