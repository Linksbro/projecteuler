package problems;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/23/13
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem16 extends Problem {
    @Override
    public void run() {
        BigInteger bi = BigInteger.valueOf(2);
        bi = bi.pow(1000);
        char[] bytes = bi.toString().toCharArray();
        int sum = 0;
        for (char b : bytes) {
            sum += Integer.parseInt(b + "");
        }
        o(sum);

    }
}
