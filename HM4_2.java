package Module4;
/**
Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
Аргументы функции: ширина прямоугольника в символах, высота прямоугольника в символах

Например 3 на 2
Вывод программы:
+ + +
+ + +

 */
import java.util.Scanner;

public class HM4_2 {
    public static void drawRectangle1(int x) {

        if (x > 0) {
            System.out.print("+");
            drawRectangle1(x - 1);
        }
    }

    public static void drawRectangle2(int x) {
        System.out.print("+");
        for (int i = 2; i < x; i++) {
            System.out.print(" ");
        }
        System.out.println("+");

    }

    public static void main(String[] args) {
        System.out.println("Enter the width of the rectangle");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Enter the height of the rectangle");
        Scanner sc1 = new Scanner(System.in);
        int y = sc1.nextInt();

        drawRectangle1(x);
        System.out.println();

        if (y > 2) {
            for (int i = 2; i < y; i++) {
                drawRectangle2(x);
            }
        }
        drawRectangle1(x);
    }
}
