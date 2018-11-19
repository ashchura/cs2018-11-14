package by.it.chernovik.myTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму ");
        int sum = sc.nextInt();
        String rub = " рубль";
        if (sum % 10 == 5 || sum % 10 == 6 || sum % 10 == 7 || sum % 10 == 8 || sum % 10 == 9 || sum % 10 == 0 || sum % 100 == 11 || sum % 100 == 12 || sum % 100 == 13 || sum % 100 == 14)
            rub = " рублей";
        if (sum % 10 == 1 && sum % 100 != 11)
            rub = " рубль";
        if ((sum % 10 == 2 || sum % 10 == 3 || sum % 10 == 4) && sum % 100 != 12 && sum % 100 != 13 && sum % 100 != 14)
            rub = " рубля";
        System.out.println("Сумма: " + sum + rub);
    }
}
