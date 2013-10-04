package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem40 extends Problem {
    @Override
    public void run() {
        int size=0;
        int tempSize=size;
        int triggerIdx = 0;
        int prod = 1;
        int[] triggers = {1, 10, 100, 1000, 10000, 100000, 1000000};
        for (int i = 1; i < 1000000; i++)
        {
            int[] digits = GeneralFunctions.getDigits(i);
            size += digits.length;
            if (triggerIdx >= 7){

            }
            else if (triggers[triggerIdx] <= size && triggers[triggerIdx] > tempSize)
            {
                int dif = size - triggers[triggerIdx];
                o(size+" "+digits.length+" "+triggerIdx+" "+dif);
                o(digits[(digits.length-1)-dif]);
                prod *= digits[(digits.length-1)-dif];
                triggerIdx++;
            }
            tempSize = size;
        }
        o(prod);
    }
}
