/*
 * Task2
 *
 * Authentic author: <yair lahad>
 * I.D.: <205493018>
 * Last update: <03/11/19>
 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int a = myScanner.nextInt();
		int b = myScanner.nextInt();
		int n = (int) (Math.random() * ((b - a) + 1)) + a; //addtional range includes boundries of a and b.
		System.out.println(n);

        //---------------write your code ABOVE this line only!--------------
    }
}