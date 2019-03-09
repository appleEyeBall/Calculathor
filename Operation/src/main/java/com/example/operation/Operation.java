package com.example.operation;
import android.net.wifi.WifiManager;
import android.util.Log;

import java.lang.Math.*;

public class Operation {
    public String addition(String firstNumber, String secondNumber){
        if (firstNumber.equals("")) {firstNumber="0";}      //defaualt values, so the app doesn't crash
        if (secondNumber.equals("")) {secondNumber = "0"; }
        if (firstNumber.contains(".") || secondNumber.contains(".")) {
            double first = Double.valueOf(firstNumber);
            double second = Double.valueOf(secondNumber);
            return String.valueOf(first+second);
        }
        else {
            int first = Integer.valueOf(firstNumber);
            int second = Integer.valueOf(secondNumber);
            return String.valueOf(first+second);
        }
    }
    public String subraction(String firstNumber, String secondNumber){
        if (firstNumber.equals("")) {firstNumber="0";}
        if (secondNumber.equals("")) {secondNumber = "0"; }
        if (firstNumber.contains(".") || secondNumber.contains(".")) {
            double first = Double.valueOf(firstNumber);
            double second = Double.valueOf(secondNumber);
            return String.valueOf(first-second);
        }

        else {
            int first = Integer.valueOf(firstNumber);
            int second = Integer.valueOf(secondNumber);
            return String.valueOf(first-second);
        }
    }
    public String multiplication(String firstNumber, String secondNumber){
        if (firstNumber.equals("")) {firstNumber="1";}
        if (secondNumber.equals("")) {secondNumber = "1"; }
        if (firstNumber.contains(".") || secondNumber.contains(".")) {
            double first = Double.valueOf(firstNumber);
            double second = Double.valueOf(secondNumber);
            return String.valueOf(first*second);
        }

        else {
            int first = Integer.valueOf(firstNumber);
            int second = Integer.valueOf(secondNumber);
            return String.valueOf(first*second);
        }
    }
    public String division(String firstNumber, String secondNumber){
        if (firstNumber.equals("")) {firstNumber="1";}
        if (secondNumber.equals("")) {secondNumber = "1"; }
        if (firstNumber.contains(".") || secondNumber.contains(".") ||
                Integer.valueOf(firstNumber) < Integer.valueOf(secondNumber)) {
            double first = Double.valueOf(firstNumber);
            double second = Double.valueOf(secondNumber);
            return String.valueOf(first/second);
        }
        else {
            int first = Integer.valueOf(firstNumber);
            int second = Integer.valueOf(secondNumber);
            return String.valueOf(first/second);
        }
    }
    public String sine(String numOnScreen){
        if (numOnScreen.equals("")) {numOnScreen="0";}
        double numInRad = Math.toRadians(Double.valueOf(numOnScreen));
        return String.valueOf(Math.sin(numInRad));
    }
    public String cosine(String numOnScreen){
        if (numOnScreen.equals("")) {numOnScreen="0";}
        Log.v("Oluwatise", "num is "+ numOnScreen);
        double numInRad = Math.toRadians(Double.valueOf(numOnScreen));
        return String.valueOf(Math.cos(numInRad));
    }
    public String tangent(String numOnScreen){
        if (numOnScreen.equals("")) {numOnScreen="0";}
        double numInRad = Math.toRadians(Double.valueOf(numOnScreen));
        return String.valueOf(Math.tan(numInRad));
    }

}
