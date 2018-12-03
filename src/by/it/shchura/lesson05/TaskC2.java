package by.it.shchura.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.*;

public class TaskC2 {
    public static void main(String[] args) throws Exception {

        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20 && sc.hasNext(); i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
    }

    public static void sort(int[] array) {

        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        };

        List<Integer> list = new ArrayList<Integer>();
        for (int number : array) {
            list.add(number);
        }

        Integer[] arr = list.toArray(new Integer[20]);
        Arrays.sort(arr, (a, b) -> {return b - a;});
        for (Integer number : arr) {
            System.out.println(number);
        }
    }
}
