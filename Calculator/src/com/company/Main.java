package com.company;

import java.util.Scanner;

// использование switch/case на примере калькулятора

public class Main {
    public static void main(String[] args) {
        double num1, num2, result;
        char operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число");
        num1 = input.nextInt();

        System.out.println("Введите второе число");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Выберите действие");
        operation = op.next().charAt(0);

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Ваш ответ: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Ваш ответ: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Ваш ответ: " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println("Ваш ответ: " + result);
                break;

            default:
                System.out.println("Виды операций: +, -, *, /");
                break;
        }
        input.close();
    }
}
