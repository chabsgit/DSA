package org.java.dsa.recursion;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        sumOfNaturalNumbers(3, 0);
        System.out.println(sumOfNaturalNumbers(3));
    }

    /**
     * Calculates sum of naturals numbers Naturals Numbers : Natural numbers are
     * the counting numbers, starting from 1 and extending infinitely 1,2,3....n
     *
     *
     * @param num
     */
    public static void sumOfNaturalNumbers(int num, int sum) {
        if (num == 0) {
            System.out.println(sum);
            return;
        }

        sumOfNaturalNumbers(num-1, sum+num);
    }

    /**
     * Calculates sum of naturals numbers Naturals Numbers : Natural numbers are
     * the counting numbers, starting from 1 and extending infinitely 1,2,3....n
     *
     *
     * @param num
     */
    public static int sumOfNaturalNumbers(int num) {
        if (num == 0) {
            return 0;
        }

        return num + sumOfNaturalNumbers(num-1);
    }
}
