package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MathTask mathTask = new MathTask();

        System.out.println("1. Shooting from a howitzer. The elevation angle of the barrel a and the initial velocity of the projectile are given. in km / h. " +
                "Calculate the projectile flight distance. Implement angle solutions in degrees and radians.\n" +
                "2. The speed of the first car is v1 km / h, the second - v2 km / h, the distance between them is km. " +
                "What is the distance between them in t h if the cars are moving in different directions?\n" +
                "3. Write a logical expression that takes the value 1 if the point lies inside the shaded area, otherwise - 0.\n" +
                "4. Calculate the value of the expression");

        System.out.println("Please, enter number task from 1 to 4: ");

        Scanner scanner = new Scanner(System.in);
        int numberTask = scanner.nextInt();

        switch (numberTask){
            case 1:
                System.out.println(mathTask.getProjectileFlightDistance(30,60));
            case 2:
                System.out.println(mathTask.getDistanceThroughTime(20,50,90,3));
            case 3:
                System.out.println(mathTask.getDomainOwnership(0.12,0.05));
                System.out.println(mathTask.getDomainOwnership(6.7,9.05));
            case 4:
                System.out.println(mathTask.evaluateExpression(0.6));
            default:
                System.out.println("Oops, you had enter number task from 1 to 4.");

        }







    }
}
