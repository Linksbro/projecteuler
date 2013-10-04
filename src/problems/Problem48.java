package problems;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/6/13
 * Time: 12:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class Problem48 extends Problem {
    @Override
    public void run() {
        BigInteger bi = new BigInteger("1");
        for (int i = 2; i < 1000; i++)
        {
            bi = bi.add(new BigInteger(""+i).pow(i));
        }
        o(bi.toString());

    }
}
