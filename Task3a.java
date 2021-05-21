/*
 * Task3a
 *
 * Authentic author: <yair lahad>
 * I.D.: <205493018>
 * Last update: <03/11/19>
 */

import java.util.Scanner;

public class Task3a {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int n = myScanner.nextInt();
		int value=1;//neutral for multiplication
		while(n>0){
			value=value*2;//the while loop computes 2^n - basis of 2, n times
			n=n-1;
		}
		System.out.println(value);

        //---------------write your code ABOVE this line only!--------------
    }

    
}