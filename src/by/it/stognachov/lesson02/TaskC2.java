package by.it.stognachov.lesson02;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c=sc.nextInt();
        int sum=s+c;
        System.out.println("DEC:"+s+"+"+c+"="+sum);
        System.out.println("BIN:"+Integer.toBinaryString(s)+"+"+Integer.toBinaryString(c)+"="+Integer.toBinaryString(sum));
        System.out.println("HEX:"+Integer.toHexString(s)+"+"+Integer.toHexString(c)+"="+Integer.toHexString(sum));
        System.out.println("OCT:"+Integer.toOctalString(s)+"+"+Integer.toOctalString(c)+"="+Integer.toOctalString(sum));
    }
}
