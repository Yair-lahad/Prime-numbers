/*
 * Task4c
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task4c {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
        Scanner myScanner = new Scanner (System.in);
        int n = myScanner.nextInt();
        int randNum = (int) (Math.random() *(n-2))+2;// random number in the range [2,n-1]
        System.out.println(randNum);

        //---------------write your code ABOVE this line only!--------------
    }

    
}