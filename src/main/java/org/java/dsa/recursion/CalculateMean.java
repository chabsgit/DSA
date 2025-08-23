package org.java.dsa.recursion;

public class CalculateMean {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5, 8};
        calculateMean(arr, 0, 0);
    }

    /**
     * Calculates the mean of an array of integers using recursion.
     * 
     * 1 + 2 + 3 + 4 + 5 = 15/5 = 3
     * 
     * 
     */
    public static void calculateMean(int arr[], int index, int sum){
        if(index == arr.length){
            System.out.println(sum/arr.length);
            return;
        }
        sum = sum + arr[index];
        calculateMean(arr, index+1, sum);
    }

}
