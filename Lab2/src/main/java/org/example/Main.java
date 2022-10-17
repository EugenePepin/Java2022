package org.example;

import java.util.Scanner;
import java.util.Arrays;
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
        try {
            System.out.println("Cереднє арифметичне непарних елементів: " +  arithmeticmean(mas));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    //заповнення масиву випадковими числами

    public static int[] massive(int n) {
        return new Random().ints(-100, 100).limit(n).toArray();
    }
    public static int arithmeticmean(int[] mas) {
        int sum = 0;
        int num = 0;
        int numbers[] = mas;
        for (int i = 0; i < mas.length; i+=2) {
            sum+=mas[i];
            num++;
        }
        int result = sum/num;
        if (num > 0)
            return result;

        else
            throw new IllegalArgumentException("В масиві немає непарних значень!");

    }
    }
