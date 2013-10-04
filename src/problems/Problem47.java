package problems;

import libs.GeneralFunctions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 11:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem47 extends Problem {
    @Override
    public void run() {
        for (int i = 1; i < 1000000; i++)
        {
            if (distinctNumsInList(GeneralFunctions.primeFactors(i)) == 4)
            {
                if (distinctNumsInList(GeneralFunctions.primeFactors(i+1)) == 4)
                {
                    if (distinctNumsInList(GeneralFunctions.primeFactors(i+2)) == 4)
                    {
                        if (distinctNumsInList(GeneralFunctions.primeFactors(i+3)) == 4)
                        {
                            o(i+" "+(i+1)+" "+(i+2)+" "+(i+3));
                            return;
                        }
                    }
                }
            }
        }
    }
    public int distinctNumsInList(List<Integer> g)
    {
        List<Integer> unqiues = new ArrayList<Integer>();
        for (int i : g)
        {
            if (!unqiues.contains(i)) unqiues.add(i);
        }
        return unqiues.size();
    }
}
