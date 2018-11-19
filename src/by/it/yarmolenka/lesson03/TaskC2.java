package by.it.yarmolenka.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
    public static int sumDigitsInNumber(int number){
        int sum = 1;
        int a = number % 10;
        int b = 0;
        if (number > 9)
            b = (number % 100 - a) / 10;
        else
            return sum = a;
        int c = 0;
        if (number > 99)
            c = (number % 1000 - a - 10 * b) / 100;
        else
            return sum = a + b;
        int d = 0;
        if (number > 999)
            d = (number % 10000 - a - 10 * b - 100 * c)/ 1000;
        else
            return sum = a + b + c;
        int e = 0;
        if (number > 9999)
            e = (number % 100000 - a - 10 * b - 100 * c - 1000 * d) / 10000;
        else
            return sum = a + b + c + d;
        int f = 0;
        if (number > 99999)
            f = (number % 1000000 - a - 10 * b - 100 * c - 1000 * d - 10000 * e) / 100000;
        else
            return sum = a + b + c + d + e;
        int g = 0;
        if (number > 999999)
            g = (number % 10000000 - a - 10 * b - 100 * c - 1000 * d - 10000 * e - 100000 * f) / 1000000;
        else
            return sum = a + b + c + d + e + f;
        return sum = a + b + c + d + e + f + g;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sumDigitsInNumber(number));
    }




//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }

}
