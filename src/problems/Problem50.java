package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/6/13
 * Time: 12:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class Problem50 extends Problem {
    public int[] primes = new int[10000];
    @Override
    public void run() {
        int idx = 1;
        while (primes[9999] == 0)
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
        int longestChain = 0;
        int biggestPrime = 0;
        for (int min = 0; min < 10000; min++)
        {
            for (int max = min+1; max < 10000; max++)
            {
                int sum = 0;
                for (int i = min; i < max; i++)
                {
                    sum += primes[i];
                }
                //o("found, from "+min+" to "+max+". "+sum);
                if (GeneralFunctions.isPrime(sum))
                {
                    //o("found, from "+min+" to "+max+". "+sum);
                    if (longestChain < max-min)
                    {
                        longestChain = max-min;
                    }
                    if (sum < 1000000 && sum > biggestPrime)
                    {
                        biggestPrime = sum;
                        o(sum);
                    }
                }
            }
        }
        o(longestChain);
    }

}
