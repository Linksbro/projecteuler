package problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/24/13
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem29 extends Problem {
    @Override
    public void run() {
        ArrayList<BigInteger> distinctTerms = new ArrayList<BigInteger>();
        for (int a = 2; a <= 100; a++)
        {
            for (int b = 2; b <= 100; b++)
            {
                BigInteger pow = new BigInteger(a+"");
                pow = pow.pow(b);
                if (!distinctTerms.contains(pow))
                {
                    o(a+" "+b);
                    distinctTerms.add(pow);
                }
            }
        }
        Collections.sort(distinctTerms);
        o("Size: "+distinctTerms.size());
    }
}
