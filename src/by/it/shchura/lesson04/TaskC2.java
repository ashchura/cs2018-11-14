package by.it.shchura.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {

            int[] arr = new int[2];
            int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            for (int i = 0; i < 2; i++) {
                arr[i] = sc.nextInt();
            }

            int dayNumber = 0;

            if (arr[1] == 1) {
                System.out.println(arr[0]);
                continue;
            }
            for (int i = 0; i < arr[1] - 1; i++) {
                dayNumber += months[i];
            }
            System.out.println(dayNumber + arr[0]);
        }
        sc.close();
    }
}
