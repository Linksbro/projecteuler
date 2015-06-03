package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/22/13
 * Time: 11:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem14 extends Problem {
    public int[][] arr = new int[1000000][1];
    public int longestSeq = 0;

    public void run() {
        int tempSeq = 0;
        for (int i = 1; i < 1000000; i++) {
            tempSeq = genSeq(i);
            arr[i][0] = tempSeq;
            if (tempSeq > longestSeq) {
                longestSeq = tempSeq;
                o("Length: " + longestSeq + " ; " + genSeqS(i));
            }
        }
        o(longestSeq);
    }

    public int genSeq(int i) {
        long t = i;
        int c = 2;
        while ((t = next(t)) != 1) {
            if (t < i) {
                int length = arr[(int)t][0];
                return length + c;
            }
            c++;
        }
        return c;
    }

    public String genSeqS(int i) {
        long t = i;
        int c = 2;
        String s = i + "";
        while ((t = next(t)) != 1) {
            c++;
            s += " -> " + t;

        }
        return s;
    }

    public long next(long i) {
        if (i % 2 == 0)
            return i / 2;
        else
            return 3 * i + 1;
    }

}
