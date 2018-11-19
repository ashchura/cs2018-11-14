package by.it.akulov.lesson02;

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

import java.util.Scanner;

class TaskC2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        System.out.printf("DEC:%d+%d=%d%n", a, b, sum);
        System.out.printf("BIN:%s+%s=%s%n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(Integer.parseInt(Integer.toBinaryString(a), 2) + Integer.parseInt(Integer.toBinaryString(b), 2)));
        System.out.printf("HEX:%s+%s=%s%n", Integer.toHexString(a), Integer.toHexString(b), Integer.toHexString(sum));
        System.out.printf("OCT:%s+%s=%s%n", Integer.toOctalString(a), Integer.toOctalString(b), Integer.toOctalString(sum));
    }
}
