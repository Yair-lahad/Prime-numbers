/*
 * Task4f
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task4f {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int s = myScanner.nextInt();
        int d = myScanner.nextInt();
        int k = myScanner.nextInt();
        int powBtimesD = 1;//neutral for multiplication
        boolean compo = true;
        int b=2;
        for (int loop = 0; loop <= k & compo; loop++) {
            b=(int)(Math.random()*(n-2))+2;
            for (int i = 0; i <= d - 1; i++) {
                powBtimesD = (powBtimesD * b) % n; // computes (b^d)%n
            }
            powBtimesD = powBtimesD % n;
            if (powBtimesD != 1) { // first condition of *
                int pow = 1;// power of 2^i
                for (int i = 0; i <= s - 1 & compo; i = i + 1) {
                    int bTimesCond = 1;
                    for (int j = 0; j <= (pow * d) - 1; j++) {
                        bTimesCond = (bTimesCond * b) % (n);// computes b^ (2^i *d)%n
                    }
                    bTimesCond = bTimesCond % n; // second condition of *
                    if (bTimesCond == (n - 1)) {
                        compo = false;
                    }
                    pow = pow * 2;
                }

            }

        }
        if (compo) {
            System.out.println(b + " is a witness. " + n + " is composite.");

        } else {
            System.out.println("We assume " + n + " is prime.");
        }


        //---------------write your code ABOVE this line only!--------------
    }

    
}