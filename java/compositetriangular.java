import java.lang.Math;
import java.io.*;
import java.util.*;

/* Problem #12
The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28

We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
 */

class CompositeTriangular {
    static Vector<Integer> divisorGenerator(double n) {
        Vector<Integer> output = new Vector<Integer>();

        // looking above this bound is redundant since no divisors will be found
        int bound = (int) Math.round(Math.sqrt(n) + 2);

        for (int i = 1; i < bound; i++) {
            if (n % i == 0) {
                output.add(i);
                if (i * i != n) {
                    output.add((int) Math.round(n / i));
                }
            }
        }

        return output;
    }

    public static void main(String args[]) {
        int i = 1;

        while (true) {
            i++;
            double n = (i * i + i) / 2;
            int f = divisorGenerator(n).size();
            if (f > 500) {
                // should print 76576500
                System.out.println(n);
                break;
            }
        }
    }
}