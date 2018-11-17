package by.it.yarmolenka.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/

import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a + b;
        System.out.print("Sum = ");
        System.out.println(sum);
    }





}
