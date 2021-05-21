/*
 * Task3b
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task3b {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
        Scanner myScanner = new Scanner (System.in);
        int n = myScanner.nextInt();
        int k = myScanner.nextInt();
        int value=1;//neutral for multiplication
        for (int i=0;i<=n-1;i++){
            value=(value*2)%k; // computes 2^n
        }
        value=value%k;
        System.out.println(value);
        //---------------write your code ABOVE this line only!--------------
    }

    
}