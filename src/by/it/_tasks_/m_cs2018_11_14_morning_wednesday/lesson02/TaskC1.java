package by.it._tasks_.m_cs2018_11_14_morning_wednesday.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 2 && sc.hasNext(); i++) {
            sum += sc.nextInt();
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
