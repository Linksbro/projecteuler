package libs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/22/13
 * Time: 11:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class GeneralFunctions {
    public static ArrayList<Integer> divisors(int i) {
        ArrayList<Integer> divs = new ArrayList<Integer>();
        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0)
                divs.add(j);
        }
        divs.add(i);
        return divs;
    }

    public static ArrayList<Integer> properDivisors(int i) {
        ArrayList<Integer> divs = new ArrayList<Integer>();
        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0)
                divs.add(j);
        }
        return divs;
    }

    public static boolean isPerfect(int i) {
        int divs = 0;
        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0)
                divs += j;
        }
        return divs == i;
    }

    public static boolean isPerfect(long l) {
        long divs = 0;
        for (long j = 1; j <= l / 2; j++) {
            if (l % j == 0)
                divs += j;
        }
        return divs == l;
    }

    public static boolean isDeficient(int i) {
        int divs = 0;
        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0)
                divs += j;
        }
        return divs < i;
    }

    public static boolean isAbundant(int i) {
        int divs = 0;
        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0)
                divs += j;
        }
        return divs > i;
    }

    public static boolean isDeficient(long l) {
        long divs = 0;
        for (long j = 1; j <= l / 2; j++) {
            if (l % j == 0)
                divs += j;
        }
        return divs < l;
    }

    public static boolean isAbundant(long l) {
        long divs = 0;
        for (long j = 1; j <= l / 2; j++) {
            if (l % j == 0)
                divs += j;
        }
        return divs > l;
    }

    public static int amountOfDivisors(int i) {
        int count = 2;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0)
                count++;
        }
        return count;
    }

    public static boolean isPandigital(long i) {
        char[] cArr = (i + "").toCharArray();
        String iS = i + "";
        for (int j = 1; j < cArr.length + 1; j++) {
            if (!iS.contains(j + "")) return false;
        }
        return true;
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return 0 is acute 1 is right 2 is obtuse
     */
    public static int triangleType(double a, double b, double c)
    {
        if (Math.pow(a,2) + Math.pow(b, 2) > Math.pow(c, 2))
            return 0;
        else if (Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c, 2))
            return 1;
        else
            return 2;

    }

    /**
     *
     * @param i num
     * @param max min-max pandigital
     * @return
     */
    public static boolean isPandigital(long i, int min, int max) {
        char[] cArr = (i + "").toCharArray();
        String iS = i + "";
        for (int j = min; j < max; j++) {
            if (!iS.contains(j + "")) return false;
        }
        return true;
    }

    public static int[] getDigits(long j) {
        char[] cArr = (j + "").toCharArray();
        int[] ints = new int[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            ints[i] = Character.getNumericValue(cArr[i]);
        }
        return ints;
    }

    public static int factorial(int i) {
        int sum = 1;
        for (int j = i; j > 0; j--)
            sum *= j;
        return sum;
    }

    public static int[] intPermutations(int i) {
        String s = i + "";
        if (s.length() == 1) {
            return new int[]{i};
        }
        int[] ans = new int[s.length()];
        int[] digits = getDigits(i);
        for (int j = 0; j < s.length(); j++) {
            int[] tempDigits = Arrays.copyOf(digits, digits.length);
            for (int k = 0; k < s.length(); k++) {
                if (k == 0) {
                    digits[0] = tempDigits[tempDigits.length - 1];
                } else {
                    digits[k] = tempDigits[k - 1];
                }
            }
            String numString = "";
            for (int m : digits)
                numString += m + "";
            ans[j] = Integer.parseInt(numString);
        }
        return ans;
    }
    public static int digitsToInt(int[] digits)
    {
        String numString = "";
        for (int m : digits)
            numString += m + "";
        return Integer.parseInt(numString);
    }
    public static void swap(Object[] arr, int idx1, int idx2) {
        Object temp1 = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp1;
    }

    public static boolean isPalindromic(String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
    public static boolean isComposite(int i)
    {
        return (GeneralFunctions.properDivisors(i).size() > 1);
    }
    public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
    public static boolean sameDigits(int i, int j)
    {
        int[] iDigits = getDigits(i);
        int[] jDigits = getDigits(j);
        boolean[] b1 = new boolean[10];
        boolean[] b2 = new boolean[10];
        for (int iD : iDigits)
        {
            b1[iD] = true;
        }
        for (int jD : jDigits)
        {
            b2[jD] = true;
        }
        for (int z = 0; z < 10; z++)
        {
            if (b1[z] != b2[z])
                return false;
        }
        return true;

    }

    /**
     * Supports only 1-1000
     *
     * @param i
     * @return
     */
    public static String numToBritishString(int i) {
        String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String num = i + "";
        int[] digits = new int[num.length()];
        char[] temp = num.toCharArray();
        for (int j = 0; j < num.length(); j++) {
            digits[j] = Integer.parseInt(temp[j] + "");
        }
        if (num.length() == 1) {
            return ones[i - 1];
        }
        if (num.length() == 2) {
            if (i == 10) return "ten";
            if (i > 10 && i < 20)
                return teens[i - 11];
            if (i > 19 && i < 100) {
                if (digits[1] != 0)
                    return tens[digits[0] - 1] + "-" + ones[digits[1] - 1];
                else
                    return tens[digits[0] - 1];
            }
        }
        if (num.length() == 3) {
            if (digits[1] == 0 && digits[2] == 0)
                return ones[digits[0] - 1] + " hundred";
            else
                return ones[digits[0] - 1] + " hundred and " + numToBritishString((digits[1] * 10) + digits[2]);
        }
        if (i == 1000) return "one thousand";
        return "NOPE";
    }

    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) return false;
        }
        return true;
    }

}
