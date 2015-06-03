package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem34 extends Problem {
    @Override
    public void run() {
        for (int i = 10; i < 50000000; i++)
        {
            int[] digits = GeneralFunctions.getDigits(i);
            int sum = 0;
            for (int j : digits)
                sum += GeneralFunctions.factorial(j);
            if (sum == i)
                o(i);
        }
    }
}
