/*
 * Task4a
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task4a {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
        Scanner myScanner = new Scanner (System.in);
        int n = myScanner.nextInt();
        boolean isPrime= true; // flag for knowing whether a number is prime or not
        int div=2; //lowest non trivial divisor
        while(((div * div) <= n) & isPrime){
            if(n%div==0) {
                isPrime = false; // checking for none trivial divisor
            }
            div=div+1;
        }
        if(isPrime){
            System.out.println("prime");
        }
        else {
            System.out.println("composite");
        }
        //---------------write your code ABOVE this line only!--------------
    }

    
}