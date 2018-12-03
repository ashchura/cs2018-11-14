package by.it.shchura.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskB3 {

    public static void main(String[] args) {

        int[] arr = new int[]{123, 99, 88, 77, 66, 5, 4, 3, 0, 2};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10 && sc.hasNext(); i++) {
            arr[i] = sc.nextInt();
        }

        int firstElement = arr[0];
        int lastElement = arr[9];

        Arrays.sort(arr);
        String arr2[] = Arrays.toString(arr)
                                .replaceAll("\\[", "")
                                .replaceAll("]", "")
                                .split(", ");
        List list = Arrays.asList(arr2);

        System.out.println("first element=" + list.indexOf(String.valueOf(firstElement)));
        System.out.println("last element=" + list.indexOf(String.valueOf(lastElement)));
    }
}
