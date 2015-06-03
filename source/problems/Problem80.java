package problems;

import libs.GeneralFunctions;

import java.math.BigDecimal;

/**
 * User: links
 * Date: 3/24/14
 * ... __                      __  ________
 * .. / /  ___ ________  ___  /  |/  / ___/
 * . / _ \/ _ `/ __/ _ \/ _ \/ /|_/ / /__
 * ./_.__/\_,_/\__/\___/_//_/_/  /_/\___/
 */
public class Problem80 extends Problem {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            BigDecimal d = new BigDecimal(i);
            BigDecimal sq = GeneralFunctions.sqrt(d, 99);
            double sqD = Math.sqrt(i);
            if (sqD != Math.floor(sqD)) {
                String[] digits = sq.toString().replaceAll("\\.", "").split("");
                for (int n = 1; n < digits.length; n++)
                    sum += Integer.parseInt(digits[n]);
            }
            o(sum);
        }
    }
}
