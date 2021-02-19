package com.metanit;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Imput a number 1");
        int x = in.nextInt();
        System.out.println("Imput a number 2");
        int a = in.nextInt();
        System.out.println("Imput a number 3");
        int b = in.nextInt();
        System.out.println("Imput a number 4");
        int c = in.nextInt();
        if ((x + 5) < 0 && c == 0)
        {
            double  fx = 1 / (a * x) - b;
        }
        else if ((x + 5) > 0 && c != 0)
        {
            double  fx = (x - a) / x;
        }
        else
        {
            double fx = (10 * x) / (c - 4);
        }

        System.out.println(x);
        in.close();
    }
}