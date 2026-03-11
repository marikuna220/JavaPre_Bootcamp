package com.company;

public class A3MethodUsageAndCalculation {
    public static double calculateSum(int[] values) {
        int sum = 0;
        int caunt =0;
        for (int v : values) {
            if (v % 2 == 0) {
                sum += v;
                caunt +=1;

            }
        }
        double average = (double)sum/caunt;
        return average;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 8};
        System.out.println(calculateSum(data));
    }

}
