package org.java.dsa.recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        decimalToBinary(13);
    }

    /**
     * Convert decimal to binary using recursive approach
     * for eg: 
     * 7 -- 7%2=1, 7/2=3 | 3%2=1,3/2=1 | 1%2=1, 1/2=0 - STOP since num to be divided is 0 - ans: 111
     * 4 -- 4%2=0, 4/2=2 | 2%2=0,2/2=1 | 1%2=1, 1/2=0 - STOP since num to be divided is 0 - 100
     * 6 -- 6%2=0,6/2=3 | 3%2=1,3/2=1 | 1%2=1, 1/2=0 - ans: 110
     * @param num
     * @return
     */
    public static void decimalToBinary(int num) {
        if(num == 0){
            return;
        }

        decimalToBinary(num/2);
        System.out.print(num%2);
    }
}
