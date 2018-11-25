package by.it.shchura.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {

    private static int[] arr = new int[2];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 2 && sc.hasNext(); i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
            sum += temp;
        }
        System.out.println("DEC:" + arr[0] + "+" + arr[1] + "=" + sum);
        System.out.println("BIN:" + Integer.toBinaryString(arr[0]) + "+" + Integer.toBinaryString(arr[1]) + "=" + Integer.toBinaryString(sum));
        System.out.println("HEX:" + Integer.toHexString(arr[0]) + "+" + Integer.toHexString(arr[1]) + "=" + Integer.toHexString(sum));
        System.out.println("OCT:" + Integer.toOctalString(arr[0]) + "+" + Integer.toOctalString(arr[1]) + "=" + Integer.toOctalString(sum));

        sc.close();
    }
}
