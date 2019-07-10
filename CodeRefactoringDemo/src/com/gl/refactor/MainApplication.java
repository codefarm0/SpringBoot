package com.gl.refactor;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactoring is a process of improving your source code without creating a
 * new functionality.Refactoring helps you keep your code solid, dry,
 * and easy to maintain.
 */
public class MainApplication implements MainApplicationInterface {

    static List<String> list = new ArrayList<>();

    public static void divisibleByTwo(int inputNumber, String str) {
        System.out.println(PROCESSING_NUMBERS + inputNumber);
        System.out.println("even num");
        list.add("Even Num " + inputNumber);
    }

    @Override
    public String toString() {
        return "MainApplication{}";
    }

    public MainApplication() {
    }
}
