package problems;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/24/13
 * Time: 3:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem26 extends Problem {
    @Override
    public void run() {
        int max = 0;
        for (int d = 2; d < 1000; d++) {
            int[] r = long_division(1, d);
            if (r != null)
            {
                if (r.length > max)
                {
                    o(d);
                    max = r.length;
                }
            }
        }
    }

    public int[] long_division(int numerator, int denominator) {
        if (numerator < 1 || numerator >= denominator) return null;
        // now we know 0 < numerator < denominator
        if (denominator % 2 == 0 || denominator % 5 == 0) return null;
        // now we know we get a purely periodic expansion
        int[] digits = new int[denominator];
        int k = 0, n = numerator;
        do {
            n *= 10;
            digits[k++] = n / denominator;
            n = n % denominator;
        } while (n != numerator);
        int[] period = new int[k];
        for (n = 0; n < k; ++n) {
            period[n] = digits[n];
        }
        return period;
    }
}
/* 7/13
1. 13 goes into   7 0 times with remainder  7; bring down a 0.
 2. 13 goes into  70 5 times with remainder  5; bring down a 0.
 3. 13 goes into  50 3 times with remainder 11; bring down a 0.
 4. 13 goes into 110 8 times with remainder  6; bring down a 0.
 5. 13 goes into  60 4 times with remainder  8; bring down a 0.
 6. 13 goes into  80 6 times with remainder  2; bring down a 0.
 7. 13 goes into  20 1 time  with remainder  7; bring down a 0.
 8. We have already seen 13/70 on line 2; so lines 2-7 have the repeating part
 */
