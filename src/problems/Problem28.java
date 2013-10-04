package problems;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/24/13
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem28 extends Problem {
    @Override
    public void run() {
        int i = 1, b = 1;
        for (int j = 2; j < 1001; j+=2)
        {
            i+=(b+j)+(b+j*2)+(b+j*3)+(b+j*4);
            b = b+j*4;
        }
        o(i);

    }
}
