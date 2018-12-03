package by.it.shchura.lesson03;

/*
Lesson 03. Task A1. Калькулятор.
Напишите программу, которая считывает с клавиатуры два целых числа a и b
после этого выводит через пробел:

сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (результат выводится как тип int).

после этого еще раз выводит через пробел
сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (но результат выводится как тип double).

Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. В программе необходимо создать объект типа Scanner.
2. Программа должна считывать два числа типа int с клавиатуры.
3. Программа должна дважды выводить в строку пять чисел через пробел.
4. Программа должна выводить int сумму, разность, произведение, частное и остаток от деления этих чисел двух чисел.
5. Программа должна выводить double сумму, разность, произведение, частное и остаток от деления этих чисел двух чисел.

Пример:

Ввод:
7 2
Вывод:
9 5 14 3 1
9.0 5.0 14.0 3.5 1.0

 */

import java.util.Scanner;

class TaskA1 {

    public static void main(String[] args) {

        double[] arr = new double[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2 && sc.hasNext(); i++) {
            arr[i] = sc.nextInt();
        }

        double sum = arr[0] + arr[1];
        double diff = arr[0] - arr[1];
        double product = arr[0] * arr[1];
        double quotient = arr[0] / arr[1];
        double remainder = arr[0] % arr[1];

        System.out.println((int)sum + " " + (int)diff + " " + (int)product + " " + (int)quotient + " " + (int)remainder);
        System.out.println(sum + " " + diff + " " + product + " " + quotient + " " + remainder);

        sc.close();
    }
}
