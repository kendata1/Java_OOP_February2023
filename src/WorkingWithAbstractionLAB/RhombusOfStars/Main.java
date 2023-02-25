package WorkingWithAbstractionLAB.RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printRow (i, n-i);
        }

        for (int i = n - 1; i > 0; i--) {
            printRow(i, n-i);
        }
    }

    private static void printRow(int n, int leadingSpaces) {

        for (int j = leadingSpaces; j > 0; j--) {
            System.out.print(" ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
