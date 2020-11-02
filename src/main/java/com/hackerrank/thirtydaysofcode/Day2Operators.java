package com.hackerrank.thirtydaysofcode;

/**
 * @author Nika Zurbaevi
 */
public class Day2Operators {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double totalCost = meal_cost + (meal_cost * tip_percent) / 100 + (meal_cost * tax_percent) / 100;
        System.out.println((int) Math.round(totalCost));
    }
}
