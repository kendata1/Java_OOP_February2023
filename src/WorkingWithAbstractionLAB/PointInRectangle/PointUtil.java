package WorkingWithAbstractionLAB.PointInRectangle;

public class PointUtil {

    /**
     * Split input by " " int coordinates
     * @param input
     * @return new Point
     */

    public static Point parsePoint (String input) {
        String [] coordinatesArr = input.split(" ");

        int x = Integer.parseInt(coordinatesArr[0]);
        int y = Integer.parseInt(coordinatesArr[1]);

        return new Point(x,y);
    }
}
