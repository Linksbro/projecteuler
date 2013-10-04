package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 5:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem35 extends Problem {
    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 1000000; i++)
        {
            if (GeneralFunctions.isPrime(i))
            {
                String s = i+"";
                if (s.length() == 1)
                {
                    count++;
                }
                else
                {
                    int[] perms = GeneralFunctions.intPermutations(i);
                    boolean flag = true;
                    for (int j : perms)
                    {
                        if (!GeneralFunctions.isPrime(j))
                        {
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                    {
                        count++;
                    }
                }
            }
        }
        o(count);
    }
}
