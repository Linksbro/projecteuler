package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 7:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem39 extends Problem {
    @Override
    public void run() {
        int highest = 0;
        for (int p = 120; p < 1000; p++) {
            int solutions = 0;
            for (int i = 1; i < p / 2; i++) {
                for (int j = 1; j < p / 2; j++) {
                    for (int k = 1; k < p / 2; k++) {
                        if (i + j + k == p) {
                            if (GeneralFunctions.triangleType((double) i, (double) j, (double) k) == 1) {
                                solutions++;
                            }
                        }
                    }
                }
            }
            if (solutions > highest)
            {
                highest = solutions;
                o(p+" "+solutions);
            }
        }
    }
}
