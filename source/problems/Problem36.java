package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 5:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem36 extends Problem {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 1000000; i++)
        {
            if (GeneralFunctions.isPalindromic(Integer.toString(i)) && GeneralFunctions.isPalindromic(Integer.toBinaryString(i)))
                sum+=i;
        }
        o(sum);
    }
}
