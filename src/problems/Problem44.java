package problems;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 10:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem44 extends Problem {
    @Override
    public void run() {
        int[] pents = new int[10000];
        ArrayList<Integer> pentsAl = new ArrayList<Integer>();
        for (int i = 1; i < 10001; i++)
        {
            pents[i-1] = pentNum(i);
            pentsAl.add(pentNum(i));
        }
        int d = Integer.MAX_VALUE;
        o(pents[3]+" "+pents[6]);
        for (int i = 0; i < pents.length; i++)
        {
            for (int j = i; j < pents.length; j++)
            {
                int sum = pents[i] + pents[j];
                int dif = pents[j] - pents[i];
                if (pentsAl.contains(sum) && pentsAl.contains(dif))
                {
                    o(sum+" "+dif+" "+pents[i]+" "+pents[j]+" "+i+" "+j);
                    if (d > Math.abs(dif))
                    {
                        d = Math.abs(dif);
                        o(d);
                    }
                }
            }
        }
        o(d);
    }
    public int pentNum(int n)
    {
        return (n*(3*n - 1)) / 2;
    }
}
