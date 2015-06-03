package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/22/13
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem12 extends Problem {
    public void run()
    {
        int divs = 0;
        int curTriNum = 0;
        int i = 0;
        while (divs < 500)
        {
            curTriNum += i;
            i++;
            divs = GeneralFunctions.amountOfDivisors(curTriNum);
            if (divs > 300)
            {
                o("Triangle Number: "+curTriNum+", Divisors: "+divs);
            }
        }
        o("Triangle Number: "+curTriNum+", Divisors: "+divs);
    }

}
