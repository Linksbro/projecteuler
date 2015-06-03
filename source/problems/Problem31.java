package problems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 2:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem31 extends Problem {
    public ArrayList<String> uniques = new ArrayList<String>();
    public int[] values = {1, 2, 5, 10, 20, 50, 100, 200};
    public char[] cValues = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    @Override
    public void run() {
        count (0,0,"");
        o(uniques.size());
    }
    public void count(int coin, int total, String s)
    {
        if (total > 200)
            return;
        if (total == 200)
        {
            registerUnique(s);
            return;
        }
        if (total < 200)
        {
            count(values[0], total+values[0], s+cValues[0]);
            count(values[1], total+values[1], s+cValues[1]);
            count(values[2], total+values[2], s+cValues[2]);
            count(values[3], total+values[3], s+cValues[3]);
            count(values[4], total+values[4], s+cValues[4]);
            count(values[5], total+values[5], s+cValues[5]);
            count(values[6], total+values[6], s+cValues[6]);
            count(values[7], total+values[7], s+cValues[7]);
        }

    }
    public void registerUnique(String s)
    {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String sSorted = new String(c);
        if (!uniques.contains(sSorted))
        {
            uniques.add(sSorted);
            //o(sSorted);
        }
    }
}
