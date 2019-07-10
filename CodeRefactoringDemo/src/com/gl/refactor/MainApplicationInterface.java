package com.gl.refactor;

public interface MainApplicationInterface {
    String PROCESSING_NUMBERS = "processing number ";

    static void main(String[] args) {
        int inputNumber = 3;

        int varInt = 2;
        if (inputNumber % varInt == 0) {
            MainApplication.divisibleByTwo(inputNumber, "default");
        }else if(inputNumber % 3 == 0) {
            System.out.println(PROCESSING_NUMBERS + inputNumber);
            System.out.println("even num, divisible by 3");
            MainApplication.list.add("Even Num, divisible by 3 " + inputNumber);
        }else{
            System.out.println(PROCESSING_NUMBERS + inputNumber);
            System.out.println("Other num");
            MainApplication.list.add("Other Num " + inputNumber);
        }
    }
}
