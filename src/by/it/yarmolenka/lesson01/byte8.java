package by.it.yarmolenka.lesson01;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.util.Scanner;

public class byte8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для скольки бит рассчитываем диапазон чисел? (8, 16, 32)");
        int a = sc.nextInt();
        System.out.println("Рассчитываем диапазон со знаком или без? (1 - со знаком, 0 - без знака)");
        int b = sc.nextInt();
        if (a != 8 && a!= 16 && a!=32){
            System.out.println("Диапазон чисел может быть рассчитан для 8, 16 или 32 бит");
        }
        if (b!=1 && b!=0){
            System.out.println("в ответе на вопрос со знаком или без рассчитывается диапазон допускаются ответы \"0\" или \"1\"");
        }
        if (a == 8 && b == 0){
            int i = (int)Math.pow(2, 8);
            System.out.println("Диапазон чисел для 8 бит без знака от 0 до " + i);
        }
        if (a == 16 && b == 0){
            int i = (int)Math.pow(2, 16);
            System.out.println("Диапазон чисел для 16 бит без знака от 0 до " + i);
        }
        if (a == 32 && b == 0){
            long i = (long)Math.pow(2, 32);
            System.out.println("Диапазон чисел для 32 бит без знака от 0 до " + i);
        }
        if (a == 8 && b == 1){
            int i = (int)Math.pow(2, 7);
            System.out.println("Диапазон чисел для 8 бит со знаком от -" + i + " до " + (i-1));
        }
        if (a == 16 && b == 1){
            int i = (int)Math.pow(2, 15);
            System.out.println("Диапазон чисел для 16 бит со знаком от -" + i + " до " + (i-1));
        }
        if (a == 32 && b == 1){
            long i = (long)Math.pow(2, 31);
            System.out.println("Диапазон чисел для 32 бит со знаком от -" + i + " до " + (i-1));
        }
    }
}
