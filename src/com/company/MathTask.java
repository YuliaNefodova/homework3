package com.company;

import java.lang.Math;

public class MathTask {

    public String getProjectileFlightDistance(double v, double a){

        double resultDegrees = Math.pow(v,2) * (Math.sin(2 * Math.toDegrees(a)) )/ 9.81;
        double resultRadians = Math.pow(v,2) * (Math.sin(2 * Math.toRadians(a)) )/ 9.81;

        String result = "In degrees " + String.format("%.2f",resultDegrees) + "\n" + "In radians " + String.format("%.2f",resultRadians) ;

        return result;
    }

    public double getDistanceThroughTime(double v1, double v2, double s, double t){

       double result = (v1 + v2) * t + s;

       return result;
    }

    public int getDomainOwnership(double x, double y){

        int result;

        if ( (x - y >= 0) & ( 3*x - 2*y - 2 <= 0)) {
            result = 1;
        }
        else
            result = 0;

      return result;
    }

    public double evaluateExpression(double x){

        double result = (6 * Math.log(Math.cbrt(Math.exp(x + 1) + 2 * Math.exp(x) * Math.cos(x))))/
                (Math.log(x - Math.exp(x + 1) * Math.sin(x)))
                + Math.abs(Math.cos(x) / Math.exp(Math.sin(x)));

        return result;
    }

}
