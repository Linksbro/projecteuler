package problems;

import libs.GeneralFunctions;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 10/23/13
 * Time: 11:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem53 extends Problem {
    @Override
    public void run() {
        int cases=0;
        o(GeneralFunctions.bigFactorial(23).toString());
        o(ncr(23, 10));
        BigDecimal million = new BigDecimal("1000000.0");
        for (int n = 1; n <= 100; n++)
            {
            for (int r = n; r > 0; r--)
            {
                if (ncr(n,r).compareTo(million) > 0)
                {
                    cases++;
                    o("Case found: ncr("+n+","+r+")");
                }
            }
        }
        o(cases);
    }
    public BigDecimal ncr(int n, int r)
    {
        return new BigDecimal(GeneralFunctions.bigFactorial(n)).divide(
                new BigDecimal(
                        (GeneralFunctions.bigFactorial(r).multiply(GeneralFunctions.bigFactorial(n-r)))
                )
        );
    }
}
