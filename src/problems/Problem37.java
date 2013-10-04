package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 6:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem37 extends Problem {
    @Override
    public void run() {
        int count = 0;
        int sum = 0;
        for (int i = 10; i < 1000000; i++)
        {
            if (GeneralFunctions.isPrime(i))
            {
                int[] l2r = truncate(i, true);
                boolean flag=true;
                for (int j : l2r)
                {
                    if (!GeneralFunctions.isPrime(j))
                        flag = false;
                }
                int[] r2l = truncate(i, false);
                for (int j : r2l)
                {
                    if (!GeneralFunctions.isPrime(j))
                        flag = false;
                }
                if (flag)
                {
                    o(i);
                    count++;
                    o(count);
                    sum+=i;
                }

            }
        }
        o(sum);
    }
    private int[] truncate(int i, boolean dir) //true for l2r, false for r2l
    {
        String s = Integer.toString(i);
        int[] ans = new int[s.length()];
        if (dir)
        {
            for (int j = 0; j < s.length(); j++)
            {
                ans[j] = Integer.parseInt(s.substring(j));
            }
        }
        else
        {
            for (int j = 0; j < s.length(); j++)
            {
                ans[j] = Integer.parseInt(s.substring(0,s.length()-j));
            }
        }
        return ans;
    }

}
