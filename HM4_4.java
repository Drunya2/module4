package Module4;

import java.util.Scanner;

/**
 Написать функцию getMax которая принимает на вход два аргумента в виде чисел. А возвращает максимальное из этих двух.
 Также, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных (int, float)
 */
public class HM4_4 {

    public static int getMax(int x, int y){
        int max = 0;
        if (x>y) {
            max = x;
        }
        else {
            max = y;
        }
        return max;
    }
    public static float getMax(float a, float b){
        float max1 = 0;
        if (a>b) {
            max1 = a;
        }
        else {
            max1 = b;
        }
        return max1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the first number int");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Enter the second number int");
        Scanner sc1 = new Scanner(System.in);
        int y = sc1.nextInt();

        System.out.println("Enter the first number float");
        Scanner sc2 = new Scanner(System.in);
        float a = sc2.nextFloat();

        System.out.println("Enter the second number float");
        Scanner sc3 = new Scanner(System.in);
        float b = sc3.nextFloat();

        int maxInt=getMax(x,y);
        float maxFloat = getMax(a,b);


        System.out.println("Maximum number int = " + maxInt);
        System.out.println("Maximum number float= " + maxFloat);

    }

}