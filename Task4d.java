/*
 * Task4d
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task4d {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
        Scanner myScanner = new Scanner (System.in);
        int n = myScanner.nextInt();
        int s=1;
        int pow=s*2;//first iteration of 2^n
        int d=(n-1)/pow;
        while(d%2==0){ // finds the odd d value and s power that satisfy the condition n-1=(2^s)*d
            s=s+1;
            pow=pow*2;
            d=(n-1)/pow;
        }
        System.out.println(s);
        System.out.println(d);



        //---------------write your code ABOVE this line only!--------------
    }

    
}