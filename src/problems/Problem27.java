package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/24/13
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem27 extends Problem {
    @Override
    public void run() {
        int longest = 10;
        int tempCount = 0;
        for (int a = -1000; a < 1000; a++)
        {
            for (int b = -1000; b < 1000; b++)
            {
                tempCount = 0;
                for (int n = 0; n < 1000; n++)
                {
                    if (GeneralFunctions.isPrime(quadEquation(a,b,n)))
                    {
                        tempCount++;
                        if (tempCount > longest)
                        {
                            longest = tempCount;
                            o("Longer equation found, with a="+a+" b="+b+" up to n="+n);
                        }
                    }
                    else
                        break;
                }
            }
        }
    }
    public long quadEquation(int a, int b, int n)
    {
        return (long)Math.pow(n, 2)+ a*n + b;
    }
}
