/* Problem #14
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?
 */

public class longestcollatz {
    private static int collatzSequence(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    public static void Main(String[] args) {
        int bestStart = 0;
        int bestCount = 0;

        for (int start = 2; start < 1000000; start++) {
            int current = start;
            int count = 1;
            while (current != 1) {
                current = collatzSequence(current);
                count++;
            }

            if (count > bestCount) {
                bestStart = start;
                bestCount = count;
            }
        }

        System.out.println("---------------");
        System.out.printf("Best start: %d\n", bestStart);
        System.out.printf("Best count: %d\n", bestCount);
    }
}
