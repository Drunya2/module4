package Module4;
/**
Задание 1
Написать функцию которая считает в консоли до числа Х.
Аргументы функции: число Х

Например Х = 5.
Вывод программы:
1
2
3
4
5
 */
import java.util.Scanner;


public class HM4 {
    public static void printNumber(int x) {


        if (x > 0) {
            System.out.print(x+"; ");
            printNumber(x - 1);
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        printNumber(x);
    }
}