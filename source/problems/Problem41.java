package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem41 extends Problem {
    @Override
    public void run() {
        for (int i = 10000000; i > 0; --i)
        {
            if (GeneralFunctions.isPandigital(i) && GeneralFunctions.isPrime(i))
            {
                o(i);
                return;
            }
        }
    }
}
