package by.it.akulov.lesson03;

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
    static double dis(int a, int b, int c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        return d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (dis(a, b, c) == 0) {
            double cor = (-b) / (2 * a);
            System.out.println(a + " " + b + " " + c);
            System.out.println(cor);
        }
        if (dis(a, b, c) > 0) {
            double cor1 = ((-b) + Math.sqrt(dis(a, b, c))) / (2 * a);
            double cor2 = ((-b) - Math.sqrt(dis(a, b, c))) / (2 * a);
            System.out.println(a + " " + b + " " + c);
            System.out.println(cor1 + " " + cor2);
        }
        if (dis(a, b, c) < 0) {
            System.out.println(a + " " + b + " " + c);
            System.out.println("Отрицательный дискриминант");
        }
    }

}
