package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/5/13
 * Time: 9:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem43 extends Problem {
    public long sum = 0;
    @Override
    public void run() {
        /*for (long i = 1406357288; i < 9876543210l; i++)
        {
            if (GeneralFunctions.isPandigital(i, 0, 9))
            {
                if (check(i)) o(i);
            }
        }*/
        permute("","1023456789");
        o(sum);
    }
    public boolean check(long i)
    {
        int[] digits = GeneralFunctions.getDigits(i);
        if (digits.length != 10) return false;
        if (!((digits[1]*100+digits[2]*10+digits[3]) % 2 == 0)) return false;
        if (!((digits[2]*100+digits[3]*10+digits[4]) % 3 == 0)) return false;
        if (!((digits[3]*100+digits[4]*10+digits[5]) % 5 == 0)) return false;
        if (!((digits[4]*100+digits[5]*10+digits[6]) % 7 == 0)) return false;
        if (!((digits[5]*100+digits[6]*10+digits[7]) % 11 == 0)) return false;
        if (!((digits[6]*100+digits[7]*10+digits[8]) % 13 == 0)) return false;
        if (!((digits[7]*100+digits[8]*10+digits[9]) % 17 == 0)) return false;
        return true;

    }
    public void permute(String beginningString, String endingString) {
        if (endingString.length() <= 1)
        {
                if (check(Long.parseLong(beginningString+endingString)))
                {
                    o(beginningString + endingString);
                    sum+=Long.parseLong(beginningString+endingString);
                }
        }
        else
            for (int i = 0; i < endingString.length(); i++) {
                try {
                    String newString = endingString.substring(0, i) + endingString.substring(i + 1);

                    permute(beginningString + endingString.charAt(i), newString);
                } catch (StringIndexOutOfBoundsException exception) {
                    exception.printStackTrace();
                }
            }
    }
}
