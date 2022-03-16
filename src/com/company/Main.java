package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner sc1=new Scanner(System.in);
        int num1= sc1.nextInt();
        System.out.println("Введите второе число:");
        Scanner sc2=new Scanner(System.in);
        int num2= sc2.nextInt();
        int result =0;
        for (int i = 0; i < num1; i++) {
            result += num2;
        }
        System.out.println("Результат умножения:"+result);
    }
}
