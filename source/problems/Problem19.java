package problems;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/23/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem19 extends Problem {
    public void run()
    {
        Calendar calendar = new GregorianCalendar(1901, 0, 1);
        int count = 0;
        while (calendar.get(Calendar.YEAR) != 2001) {
            calendar.add(Calendar.MONTH, 1);
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
                count++;
        }
        o("Count: "+count);
    }
}
