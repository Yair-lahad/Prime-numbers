/*
 * Task4b
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task4b {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
        Scanner myScanner = new Scanner (System.in);
        int n = myScanner.nextInt();
        int count=0;//number of primes until number
        int partN=2;
        while(partN<=n) {
            boolean isPrime = true;
            int div = 2; //lowest non trivial divisor
            while (((div * div) <= partN) & isPrime) {
                if (partN % div == 0) {
                    isPrime = false;
                }
                div = div + 1;
            }
            if(isPrime){
                count = count + 1;
            }
            partN = partN + 1;
        }
        System.out.println(count);
        //---------------write your code ABOVE this line only!--------------
    }

    
}