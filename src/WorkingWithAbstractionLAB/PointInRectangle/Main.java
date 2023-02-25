package WorkingWithAbstractionLAB.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] firstPointsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        Point bottomLeft = new Point(firstPointsArr[0],firstPointsArr[1]);
        Point topRight = new Point(firstPointsArr[2],firstPointsArr[3]);
        Rectangle rectangle = new Rectangle(bottomLeft,topRight);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Point pointToCheck = PointUtil.parsePoint(scanner.nextLine());

            System.out.println(rectangle.contains(pointToCheck));
        }
    }
}
