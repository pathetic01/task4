package com.pm;

public class Main {

    public static void main(String[] args) {
    double sinCalc;

        sinCalc = findSumSin();

    appealToUser(sinCalc);
    }

    private static double findSumSin(){
        double sinCalculated = 0;
        for(double i = 1; i <= 2; i = i + 0.1) {
    sinCalculated = sinCalculated + Math.sin(i);
    }
        return sinCalculated;
    }

    public static void appealToUser(double sum){
        System.out.printf("Вычислим sin 1 + sin 1,1 + ... + sin 2. \n Ответ: %.2f", sum);
    }
}


