package Module4;

import java.util.Scanner;

/**
 Перегрузить функцию drawRectangle (задание 2) таким образом, чтобы она могла принимать на вход только 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами

 Например 2
 Вывод программы:
 + +
 + +

 Например 3
 Вывод программы:
 + + +
 + + +
 + + +
 */
public class HM4_3 {
    public static void drawRectangle(int x) {

        if (x > 0) {
            System.out.print("+");
            drawRectangle(x - 1);
        }

    }

    public static void drawRectangle(double x) {
        System.out.print("+");
        for (int i = 2; i < x; i++) {
            System.out.print(" ");
        }
        System.out.println("+");


    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the side of the square");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        drawRectangle(x);
        System.out.println();


        if(x>2){
            for(int i=2; i < x; i++){
                drawRectangle(x);

                System.out.println();
            }   }
        drawRectangle(x);
    }
}