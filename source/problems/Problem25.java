package problems;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/24/13
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem25 extends Problem {
    @Override
    public void run() {
        BigInteger curFib = new BigInteger("1");
        BigInteger lastFib = new BigInteger("0");
        BigInteger tempFib = new BigInteger("0");
        int term = 1;
        while (curFib.toString().length() < 1000)
        {
            tempFib = curFib;
            curFib = curFib.add(lastFib);
            lastFib = tempFib;
            term++;
        }
        o(term);

    }
}
