package by.it.shchura.lesson03;

import java.util.Scanner;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {

    public static void main(String[] args) {

        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3 && sc.hasNext(); i++) {
            arr[i] = sc.nextInt();
        }
        double disc = disc(arr[0], arr[1], arr[2]);
        double x1;
        double x2;

        if (disc > 0) {
            x1 = (-arr[1] + Math.sqrt(disc)) / (2 * arr[0]);
            x2 = (-arr[1] - Math.sqrt(disc)) / (2 * arr[0]);
            System.out.println(x1 + " " + x2);
        } else if (disc == 0) {
            x1 = (-arr[1] + Math.sqrt(disc)) / (2 * arr[0]);
            System.out.println(x1);
        } else {
            System.out.println("Отрицательный дискриминант");
        }
        sc.close();
    }

    public static double disc(int a, int b, int c) {

        double disc = Math.pow(b, 2) - 4 * a * c;
        return disc;
    }

}
