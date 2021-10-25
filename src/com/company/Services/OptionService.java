package com.company.Services;

import java.util.ArrayList;

public class OptionService {
    private ArrayList<String> optionsService = new ArrayList<>();

    public void getOptionsService() {
        System.out.println("Options: " + optionsService);
    }

    public void addOption(String str) {
        optionsService.add(str);
    }

    public void deleteOption(String str1) {
        String element = " ";
        for (String ce : optionsService) {
            if (ce.equals(str1)) {
                element = str1;
            }
        }
        optionsService.remove(element);
    }

}
