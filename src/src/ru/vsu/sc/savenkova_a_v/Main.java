package src.ru.vsu.sc.savenkova_a_v;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Locale.setDefault(Locale.ROOT);

    int s = readNumber();
    printFigure(s);
    }

    private static int readNumber() {
        System.out.println("Введите размер фигуры:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printFigure(int s) {
        for (int i = 1; i < s; i++) {
            System.out.print("*");
        }

        System.out.println("*");

        int h = s - 2;
        int p = 1;
        int d = s - 3;

        for (int e = 1; e <= h; e++) {
            for (int t = 0; t < p; t++) {
                System.out.print(" ");
            }

            p = p + 1;
            System.out.print("*");

            for (int o = 0; o < d; o++) {
                System.out.print("$");
            }

            d = d - 1;
            System.out.println("*");
        }

        for (int x = 0; x < p; x++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
