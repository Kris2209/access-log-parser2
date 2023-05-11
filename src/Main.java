import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int number_1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int number_2 = new Scanner(System.in).nextInt();
        int sum = number_1 + number_2;
        int difference = number_1 - number_2;
        int multiply = number_1 * number_2;
        double quotient = (double)number_1 / number_2;
        // практика остатка от деления
        int remainder = number_1 % number_2;
        System.out.println("Результат сложения: " + sum);
        System.out.println("Результат вычитания: " + difference);
        System.out.println("Результат умножения: " + multiply);
        System.out.println("Результат деления: " + quotient);
        // не входит в задание, просто для практики
        System.out.println("Остаток от деления: " + remainder);
    }
}
