/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex07;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int length = myApp.getLength();
        int width = myApp.getWidth();
        int areaFeet = myApp.getFeet(length, width);
        double conversion = 0.09290304;
        double areaMeters = myApp.getMeters(areaFeet, conversion);
        String outputString = myApp.generateOutputString(areaFeet, areaMeters);
        myApp.printOutput(outputString);
    }

    public int getLength() {
        System.out.print("Whats is the length of the room in feet? ");
        return in.nextInt();
    }

    public int getWidth() {
        System.out.print("Whats is the width of the room in feet? ");
        return in.nextInt();
    }

    public int getFeet(int length, int width) {
        return length * width;
    }

    public double getMeters(int areaFeet, double conversion) {
        double Meters =  areaFeet * conversion;
        return Math.round(Meters*1000)/1000.0d;
    }

    public String generateOutputString(int areaFeet, double areaMeters) {
        return "The area is\n"+areaFeet+" square feet\n"+areaMeters+" square meters";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}
