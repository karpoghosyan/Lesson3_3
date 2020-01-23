package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Brown");
        colors.add("Blue");
        colors.add("Red");
        System.out.println(colors);
        colors.add(0, "Yellow");
        System.out.println(colors);
    }
}
