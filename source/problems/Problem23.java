package problems;

import libs.GeneralFunctions;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/4/13
 * Time: 6:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem23 extends Problem {
    @Override
    public void run() {
        int[] abunds = new int[6965];
        int ind = 0;
        for (int i = 0; i < 28123; i++)
        {
            if (GeneralFunctions.isAbundant(i))
            {
                abunds[ind] = i;
                ind++;
            }
        }
        ArrayList<Integer> sums = new ArrayList<Integer>();
        for (int i = 0; i < abunds.length; i++)
        {
            for (int j = i; j < abunds.length; j++)
            {
                int sum = abunds[i] + abunds[j];
                if (sum > 28123)
                {

                }
                else if (!sums.contains(sum))
                {
                    sums.add(sum);
                }
            }
        }
        ArrayList<Integer> exceptions = new ArrayList<Integer>();
        for (int i = 0; i < 28123; i++)
        {
            if (!sums.contains(i))
            {
                exceptions.add(i);
            }
        }
        int sumOfSums = 0;
        for (int i : exceptions)
        {
            sumOfSums += i;
        }
        o(sumOfSums);
    }
}
