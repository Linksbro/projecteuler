package problems;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/24/13
 * Time: 4:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem45 extends Problem {
    @Override
    public void run() {
        long[] tri = new long[1000000];
        long[] hex = new long[1000000];
        long[] pent = new long [1000000];
        o(pent(567561));
        for (int i = 0; i < 1000000; i++)
        {
            tri[i] = tri(i);
            hex[i] = hex(i);
            pent[i] = pent(i);
        }
        for (int i = 250; i < 1000000; i++)
        {
            for (int j = 140; j < 1000000; j++)
            {
                if (tri[i] == hex[j])
                {
                    for (int k = 165; k < 1000000; k++)
                    {
                        if (hex[j] == pent[k])
                        {
                            o(i+" "+j+" "+k+" num:"+tri[i]);
                        }
                    }
                }
            }
        }
    }
    public long tri(long i)
    {
        return (i*(i+1))/2;
    }
    public long hex(long i)
    {
        return i*((2*i-1));
    }
    public long pent(long i)
    {
        return (i*(3*i-1))/2;
    }

}
