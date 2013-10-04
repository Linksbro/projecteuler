package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem46 extends Problem {
    public int[] primes = new int[1000];
    @Override
    public void run() {
        int idx = 1;
        while (primes[999] == 0)
        {
            for (int i = primes[idx-1]+1; i < Integer.MAX_VALUE; i++)
            {
                if (GeneralFunctions.isPrime(i))
                {
                    primes[idx] = i;
                    idx++;
                    break;
                }
            }
        }
        boolean[] ods = new boolean[10000000];
        for (int i = 0; i < 1000; i++)
        {
            for (int j = 1; j < 1000; j++)
            {
                int num = primes[i] + 2 * (int)Math.pow(j, 2);
                ods[num] = true;
            }
        }
        for (int i = 1; i < ods.length; i+=2)
        {
            if (GeneralFunctions.properDivisors(i).size() > 1)
                if (!ods[i]) { o(i); return;}
        }

    }
}
