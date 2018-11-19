package by.it.chernovik.myTasks;

import java.util.Scanner;

public class Task1 {
    private static double diag(int a, int b){
        double d = Math.sqrt(a * a + b * b);
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры прямоугольного отверстия:");
        System.out.print(" a = ");
        int a = sc.nextInt();
        System.out.print(" b = ");
        int b = sc.nextInt();
        System.out.print("Введите радиус круга r = ");
        int r = sc.nextInt();
        double D = diag(a, b);
        if (D > r)
            System.out.println("Не закроет");
        else
            System.out.println("Закроет");
    }
}
