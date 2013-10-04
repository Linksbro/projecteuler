package problems;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/4/13
 * Time: 7:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem30 extends Problem {
    @Override
    public void run() {
        int sumOfSums = 0;
        for (int i = 0; i < 1000000; i++)
        {
            char[] cArr = (i+"").toCharArray();
            int sum = 0;
            for (char c : cArr)
            {
                sum += Math.pow(Character.getNumericValue(c), 5);
            }
            if (sum == i && i != 0 && i != 1)
                sumOfSums += i;
        }
        o(sumOfSums);
    }
}
