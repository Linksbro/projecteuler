package problems;

import libs.GeneralFunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/23/13
 * Time: 9:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem21 extends Problem {
    @Override
    public void run() {
        int sumOfAmiNumbers = 0;
        ArrayList<Integer> skips = new ArrayList<Integer>();

        for (int i = 1; i < 10000; i++) {
            if (!skips.contains(i)) {
                int t = sumOfProperDivisors(i);

                int s = sumOfProperDivisors(t);
                if (s == i && s != t) {
                    skips.add(t);
                    sumOfAmiNumbers += i + t;
                }
            }

        }
        o(sumOfAmiNumbers);
    }

    public int sumOfProperDivisors(int i) {
        ArrayList<Integer> nums = GeneralFunctions.properDivisors(i);
        int sum = 0;
        for (int j : nums) sum += j;
        return sum;
    }
}
