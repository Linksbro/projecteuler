package problems;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: links
 * Date: 7/23/13
 * Time: 2:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem15 extends Problem {
    public int maxX = 6, maxY = 6;
    public int tX = 1, tY = 1;
    public ArrayList<String> paths = new ArrayList<String>();
    Random g = new Random();

    public void run() {
        int giveUpAfter = 100;
        int giveUp = 0;
        String tPath;
        while (giveUp < giveUpAfter) {
            if (paths.contains((tPath = generatePath()))) {
                giveUp++;
            } else {
                paths.add(tPath);
                giveUp = 0;
            }
        }
        o(paths.size());
    }

    public String generatePath() {
        String path = "";
        while (tX != maxX || tY != maxY) {
            if (nextMove()) {
                path += "R";
            } else {
                path += "U";
            }
        }
        tY = 1;
        tX = 1;
        return path;
    }

    public boolean nextMove() {
        if (tY == maxY) {
            tX++;
            return true;
        }
        if (tX == maxX) {
            tY++;
            return false;
        }
        //false is DOWN, true is RIGHT
        if (g.nextBoolean()) {
            tX++;
            return true;
        } else {
            tY++;
            return false;
        }
    }
}
