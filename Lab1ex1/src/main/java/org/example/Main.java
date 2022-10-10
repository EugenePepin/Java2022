package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть довжину масиву n: ");
        int n = input.nextInt();
        int[] mas = massive(n);
        System.out.print("\nВведений масив : {");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(" " + mas[i]);
        }
        System.out.print(" }\n\n");
        System.out.println("Максимальний за модулем елемент масиву: " + checkmaxmod(mas));
        try {
            System.out.println("Сума елементів масиву, розташованих після останнього нульового елемента:" + checksum(mas));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    //заповнення масиву випадковими числами

    public static int[] massive(int n) {

            return new Random().ints(-100, 100).limit(n).toArray();
        }


    //метод для максимального за модулем елементу

    public static int checkmaxmod(int[] mas) {

         return Arrays.stream(mas).map(Math::abs).max().getAsInt();

    }

    //метод суми елементів масиву, розташованих після останнього нульового елемента

    public static int checksum(int[] mas) {
        int numbers[] = mas;
        int zeroIndex = -1;
        for (int index = 0; index < numbers.length; ++index) {
            if (numbers[index] == 0) {
                zeroIndex = index;
                break;
            }
        }

        if (zeroIndex != -1) {
            int absoluteSumm = 0;
            for (int index = zeroIndex + 1; index < numbers.length; ++index) {
                absoluteSumm += numbers[index];
            }
           return absoluteSumm;
        } else {
            throw new IllegalArgumentException("В масиві немає від'ємних чисел!");
        }
    }
}