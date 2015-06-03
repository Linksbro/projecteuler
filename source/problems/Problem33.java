package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem33 extends Problem {
    @Override
    public void run() {
        for (int i = 10; i < 99; i++) {
            for (int j = 10; j < 99; j++) {
                int[] num = GeneralFunctions.getDigits(i);
                int[] dem = GeneralFunctions.getDigits(j);
                double value = (double) i / (double) j;
                double value2 = 0;
                if (num[1] == 0 && dem[1] == 0)
                    continue;
                if (value >= 1)
                    continue;
                if (num[0] == dem[0]) {
                    value2 = (double) num[1] / (double) dem[1];
                } else if (num[0] == dem[1]) {
                    value2 = (double) num[1] / (double) dem[0];
                } else if (num[1] == dem[0]) {

                    value2 = (double) num[0] / (double) dem[1];
                    if (i == 49 && j == 98) {
                        o(value + " " + value2);
                    }
                } else if (num[1] == dem[1]) {
                    value2 = (double) num[0] / (double) dem[0];
                }

                if (value2 == value) {
                    o(i + " / " + j);
                }
            }
        }
    }
}
