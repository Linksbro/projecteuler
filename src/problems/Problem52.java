package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 9/27/13
 * Time: 11:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class Problem52 extends Problem {
    @Override
    public void run() {
        int start = 1;
        boolean loop = true;
        while(loop)
        {
            if (GeneralFunctions.sameDigits(start,start*2)
                    && GeneralFunctions.sameDigits(start,start*3)
                    && GeneralFunctions.sameDigits(start,start*4)
                    && GeneralFunctions.sameDigits(start,start*5)
                    && GeneralFunctions.sameDigits(start,start*6) )
            {
                o("found: "+start);
                return;
            }
            start++;
        }
    }
}
