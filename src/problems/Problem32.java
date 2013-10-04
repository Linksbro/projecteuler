package problems;

import libs.GeneralFunctions;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/4/13
 * Time: 7:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem32 extends Problem {
    @Override
    public void run() {
        int sumOfProds = 0;
        ArrayList<Integer> prods = new ArrayList<Integer>();
        for (int i = 1; i < 3500; i++) {
            for (int j = i; j < 3500; j++) {
                if ((("" + i + "" + j + "" + (i * j)).length() == 9))
                if (GeneralFunctions.isPandigital(Integer.parseInt("" + i + "" + j + "" + (i * j))) && !prods.contains(i*j)) {
                    o(i+" "+j+" "+i*j);
                    sumOfProds += i*j;
                    prods.add(i*j);
                }
            }
        }
        o(sumOfProds);
    }
}
