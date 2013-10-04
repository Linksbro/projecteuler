package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/23/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem17 extends Problem {
    @Override
    public void run() {
        String bigOne = "";
        for (int i = 1; i <= 1000; i++)
        {
            o(GeneralFunctions.numToBritishString(i));
            bigOne = bigOne.concat(GeneralFunctions.numToBritishString(i));
        }
        bigOne = bigOne.replace(" ", "").replace("-","");
        o("Length: "+bigOne.length());
    }
}
