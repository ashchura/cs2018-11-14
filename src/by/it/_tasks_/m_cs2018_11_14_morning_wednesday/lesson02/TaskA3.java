package by.it._tasks_.m_cs2018_11_14_morning_wednesday.lesson02;
/*
Измените переменные и строку вывода в программе так,
чтобы она рассчитывала и печатала следующее выражение
3*3+4*4=25
 */

class TaskA3 {
    public static void main(String[] args) {
        final int powerOfTwo = 2;
        int i = 3;
        int j = 4;
        int k = (int) Math.pow(i, powerOfTwo) + (int) Math.pow(4, powerOfTwo);
        System.out.println(i + "*" + i + "+" + j + "*" + j + "=" + k);
    }
}
