package by.it.akulov.lesson02;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


Решение:
double getWeight(int me) {
    double gm = 3.86;
    double ge = 9.81;
    double m = me/ge*gm;
    int m100 = (int) (m*100);
    if (m*100 - m100 >= 0.5) {
        return (m100+1)/100.0;
    }
    else
        return m100/100.0;
}

*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class TaskC3 {
    static double getWeight(int mass){
        double weight = new BigDecimal(mass * 3.86 / 9.81).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return weight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mass = scanner.nextInt();
        double weight = getWeight(mass);
        System.out.println(weight);
    }
}
