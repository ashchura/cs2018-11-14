package by.it.shchura.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskB1 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>(Arrays.asList("ONE", "TWO", "THREE", "FOUR", "FIVE"));
        System.out.println(strings.size());
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
