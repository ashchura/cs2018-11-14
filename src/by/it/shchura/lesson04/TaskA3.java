package by.it.shchura.lesson04;
/*
Существует ли пара?
Ввести с клавиатуры три целых числа.
Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.

Пример для чисел 1 2 2:
2 2

Пример для чисел 2 2 2:
2 2 2

 */


import java.util.Scanner;

public class TaskA3 {

    public static void main(String[] args) {

        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3 && sc.hasNext(); i++) {
            arr[i] = sc.nextInt();
        }

        int matchingCount = 0;
        int iIndex = 0;
        int jIndex = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {

                if (arr[i] == arr[j]) {
                    matchingCount++;
                    iIndex = i;
                    jIndex = j;
                }
            }
            if (matchingCount == 2) {
                System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
            }
        }

        if (matchingCount == 1) {
            System.out.println(arr[iIndex] + " " + arr[jIndex]);
        }
    }
}
