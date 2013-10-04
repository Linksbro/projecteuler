package problems;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 8/4/13
 * Time: 6:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem24 extends Problem {

    public int count = 1;
    @Override
    public void run() {
       permute("","0123456789");
    }
    public  void permute(String beginningString, String endingString) {
        if (endingString.length() <= 1)
        {
            if (count > 999999 && count < 1000001)
                o(beginningString + endingString);
                        count++;
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
