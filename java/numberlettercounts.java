/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

*/

public class numberlettercounts {
    private static int countLettersNumber(int n) {
        // 1 <= n <= 1000
        if (n < 0 || n > 1000) {
            return 0;
        }

        int count = 0;

        if (n == 1000) {
            return 11;
        }
        // length of (zero), one, two, three, four, five, six, seven, eight, nine
        int[] count1 = { 0, 3, 3, 5, 4, 4, 3, 5, 5, 4 };

        // length of ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen,
        // seventeen,
        // eighteen, nineteen
        int[] count2 = { 3, 6, 6, 8, 8, 7, 7, 9, 8, 9 };

        // length of (zero), (ten), twenty, thirty, forty, fifty, sixty, seventy,
        // eigthy, ninety
        int[] count3 = { 0, 0, 6, 6, 5, 5, 5, 7, 6, 6 };

        int first = n % 100;
        int last = (n - first) / 100;

        if (first < 10) {
            count += count1[first];
        } else if (first < 20) {
            count += count2[first % 10];
        } else {
            // extract "2" in "23" and sum its length
            count += count3[(first - first % 10) / 10] + count1[first % 10];
        }

        if (last == 0) {
            return count;
        }

        // add "and"
        if (first != 0) {
            count += 3;
        }

        // add "hundred"
        count += 7;
        // add (blank) hundred
        count += count1[last];
        return count;
    }

    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d - %d\n", i, countLettersNumber(i));
            n += countLettersNumber(i);
        }
        System.out.println(n);
    }
}
