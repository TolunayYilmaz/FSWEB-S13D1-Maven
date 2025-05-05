package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("Ergen mi " + hasTeen(9, 99, 19));
        System.out.println("Ergen mi " + hasTeen(23, 15, 42));
        System.out.println("Ergen mi " + hasTeen(22, 23, 34));

        System.out.println("Kedi " + isCatPlaying(true, 10));
        System.out.println("Kedi " + isCatPlaying(false, 36));
        System.out.println("Kedi " + isCatPlaying(true, 35));
        System.out.println("Kedi " + isCatPlaying(true, 35));

        System.out.println("Alan Dikdörtgen " + area(5.0, 4.0));
        System.out.println("Alan Dikdörtgen " + area(-1.0, 4.0));

        System.out.println("Alan Daire " + area(5.0));
        System.out.println("Alan Daire " + area(-1));


    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (clock < 0 || clock > 23) {
            return false;
        } else if (isBarking && (clock < 8 || clock >= 20)) {
            return true;
        }

        return false;


    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        int[] ages = {firstAge, secondAge, thirdAge};
        boolean result = false;
        for (int age : ages) {
            if (age <= 19 && age >= 13) {

                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            if (temp >= 25 && temp <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temp >= 25 && temp <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }


    public static double area(double width, double height) {

        if (width > 0 && height > 0) {

            return width * height;
        } else {
            return -1;
        }
    }

    public static double area(double radius) {
        if (radius > 0) {

            return radius * radius * Math.PI;
        } else {
            return -1;
        }
    }
}
