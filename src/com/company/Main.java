package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        MonthNumbers monthNumbers = new MonthNumbers();
        monthNumbers.getMonthName(7);

        MonthNumbers monthName = new MonthNumbers();
        monthNumbers.getMonthNumber("December");

        //Задача 2 и 10
        Box box1 = new Box();
        box1.getBoxType(2, 3);

        Box box2 = new Box(3);
        box2.getBoxType(3);

        Box box3 = new Box(2, 3, 4);
        box3.getBoxType(2, 3, 4);

        Box box4 = new Box();
        box4.getBoxType(3, 3, 3);

        // Задача 4
        Car car = new Car();
        car.changeColour("Audi", "Green");

        //Задача 5
        Pattern pattern = Pattern.compile("(?i)[А-я]+(.*с.*с.*с.*)");
        Matcher matcher = pattern.matcher("колбаса сосиска шоколад");
        long count = matcher.results().count();
        System.out.println("Количество слов, в которых \"с\" использовалась минимум 3 раза: " + count);

        //Задача 6
        String string = "Какой восхитительный вечер!";
        String longestWord = Arrays.stream(string.split(" "))
                .max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(longestWord);

        //Задача 7
        Pattern pattern1 = Pattern.compile("([Аа].*[Аа])");
        Matcher matcher1 = pattern.matcher("Антарктида, клоун, бит");
        System.out.println(matcher.find());

        //Задача 8
        Pattern pattern2 = Pattern.compile("((?:(?:\\d{4}[- ]){3}\\d{4}|\\d{16}))(?![\\d])");
        Matcher matcher2 = pattern.matcher("My credit card number is 4444-4444-4444-4448.");
        if(matcher.find()){
            System.out.println("Number of card: " + matcher.group(0));
        }
        else{
            System.out.println("Does not matches");
        }

        //Задача 9
        String string1 = "Проверить содержит ли программа некое слово";
        Pattern pattern3 = Pattern.compile("некое");
        Matcher matcher3 = pattern.matcher(string);

        if (matcher.find()){
            int result = string.indexOf("некое");
            System.out.println("Индекс некого слова: " + result);
        } else {
            System.out.println("Нет такого слова!");
        }
    }
}
