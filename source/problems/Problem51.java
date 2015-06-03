package problems;

import libs.GeneralFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/22/13
 * Time: 7:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class Problem51 extends Problem {
    @Override
    public void run() {
        long startingPrime =  56003;
        int primeDigits[] = GeneralFunctions.getDigits(startingPrime);
        int maxPrimeFamily = 0;
        long workingPrime = startingPrime;
        while (maxPrimeFamily < 8)
        {
            while (!GeneralFunctions.isPrime(workingPrime))
            {
                workingPrime += 2;
            }

        }
    }

}
