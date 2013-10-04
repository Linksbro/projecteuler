package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 7:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem38 extends Problem {
    public int[][] sets = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};

    @Override
    public void run() {
        int highest = 0;
        for (int i = 0; i < 100000; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                int num = generate(i,j);
                if (GeneralFunctions.isPandigital(num,1,9))
                {
                    if (highest < num) {
                        highest = num;
                        o(num);
                    }
                }
            }
        }
        o(highest);
    }

    public int generate(int i, int set) {
        String num = "";
        for (int j = 0; j < sets[set].length-1; j++)
        {
            num = num + i*sets[set][j];
        }
        if (num.isEmpty()) return 0;
        if (num.length() != 9) return 0;
        return Integer.parseInt(num);
    }
}
