package by.it.yarmolenka.lesson02;

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
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a + b;
        String d = "DEC:" + a + "+" + b + "=" + c;
        System.out.println(d);
        String binary1 = Integer.toBinaryString(a);
        String binary2 = Integer.toBinaryString(b);
        String binary3 = Integer.toBinaryString(c);
        if (binary1.length()>8) binary1=binary1.substring(binary1.length()-8);
        if (binary2.length()>8) binary2=binary2.substring(binary2.length()-8);
        if (binary3.length()>8) binary3=binary3.substring(binary3.length()-8);
        String binary = "BIN:" + binary1 + "+" + binary2 + "=" + binary3;
        System.out.println(binary);
        String hex1 = Integer.toHexString(a);
        String hex2 = Integer.toHexString(b);
        String hex3 = Integer.toHexString(c);
        String hex = "HEX:" + hex1 + "+" + hex2 + "=" + hex3;
        System.out.println(hex);
        String octal1 = Integer.toOctalString(a);
        String octal2 = Integer.toOctalString(b);
        String octal3 = Integer.toOctalString(c);
        String octal = "OCT:" + octal1 + "+" + octal2 + "=" + octal3;
        System.out.println(octal);
    }
}
