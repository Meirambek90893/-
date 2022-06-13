package com.company;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Main {

    public static void main(String args[])
    {
        float a, b, res;
        char choice, ch;
        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.print("1. + \n");
            System.out.print("2. - \n");
            System.out.print("3. * \n");
            System.out.print("4. / \n");
            System.out.print("5.Выход\n\n");
            System.out.print(" Введите Свой Выбор: ");
            choice = scan.next().charAt(0);
            switch(choice)
            {
                case '1' : System.out.print("Введите Два Числа : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a + b;
                    System.out.print("Результат = " + res);
                    break;
                case '2' : System.out.print(" Введите Два Числа: ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a - b;
                    System.out.print("Результат = " + res);
                    break;
                case '3' : System.out.print("Введите Два Числа: ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a * b;
                    System.out.print(" Результат = " + res);
                    break;

                case '4' : System.exit(0);
                    break;
                default : System.out.print("Неправильный выбор!!!");
                    break;
            }
            System.out.print("\n---------\n");
        }while(choice != 5);
    }
}





