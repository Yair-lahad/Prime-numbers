/*
 * Task1
 *
 * Authentic author: <yair lahad>
 * I.D.: <205493018>
 * Last update: <03/11/19>
 */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        int a = myScanner.nextInt(); 
        //---------------write your code BELOW this line only!--------------
		int b = myScanner.nextInt(); 
        int q = myScanner.nextInt(); 
        int r = myScanner.nextInt();
        if(r<b & b!=0 & a==q*b+r) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("no");
        }

        //---------------write your code ABOVE this line only!--------------
    }

    
}