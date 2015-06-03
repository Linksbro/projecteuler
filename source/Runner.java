import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/22/13
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    private static int problem = -1;
    private static ClassLoader classLoader = Runner.class.getClassLoader();

    public static void main(String args[]) {
        if (problem != -1) {
            System.out.println("Running...");
            try {
                Class problemClass = classLoader.loadClass("problems.Problem" + problem);
                Object pC = problemClass.newInstance();
                try {
                    problemClass.getMethod("run").invoke(pC, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                System.out.println("No problem found, bro!");
            }
        } else {
            Scanner s = new Scanner(System.in);
            while (true) {
                System.out.println("What problem would you like to run?");
                int i = 0;
                try {
                    i = Integer.parseInt(s.next());
                } catch (Exception e) {
                    System.out.println("Try an integer!");
                    System.exit(0);
                }
                if (i != 0) {
                    try {
                        Class problemClass = classLoader.loadClass("problems.Problem" + i);
                        Object pC = problemClass.newInstance();
                        try {
                            long start = System.currentTimeMillis();
                            problemClass.getMethod("run").invoke(pC, null);
                            System.out.println("Took "+(System.currentTimeMillis()-start)+"ms to execute");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                        System.out.println("No problem found, bro!");
                    }
                }
            }
        }

    }
}
