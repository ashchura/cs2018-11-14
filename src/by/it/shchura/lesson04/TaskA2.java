package by.it.shchura.lesson04;

/*

День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7,
    то вывести уведомление что такого дня недели не существует.
5.  Нельзя использовать массивы или коллекции Java.

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

 */

import java.util.Scanner;

public class TaskA2 {

    public static final String MONDAY = "понедельник";
    public static final int MONDAY_DIGIT = 1;

    public static final String TUESDAY = "вторник";
    public static final int TUESDAY_DIGIT = 2;

    public static final String WEDNESDAY = "среда";
    public static final int WEDNESDAY_DIGIT = 3;

    public static final String THURSDAY = "четверг";
    public static final int THURSDAY_DIGIT = 4;

    public static final String FRIDAY = "пятница";
    public static final int FRIDAY_DIGIT = 5;

    public static final String SATURDAY = "суббота";
    public static final int SATURDAY_DIGIT = 6;

    public static final String SUNDAY = "воскресенье";
    public static final int SUNDAY_DIGIT = 7;

    public static String resolveDay(int number) {
        switch (number) {
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return "";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {

            int number = sc.nextInt();
            if (number == -1) {
                break;
            } else if (number <= 0 || number > 7) {
                System.out.println("такого дня недели не существует");
                continue;
            }
            System.out.println(resolveDay(number));
        }
        sc.close();
    }
}
