import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину треугольника: ");
        double base = scanner.nextDouble();

        System.out.println("Введите высоту треугольника: ");
        double height = scanner.nextDouble();

        //Площадь треугольника вычисляется по формуле = (width*height)/2
        double area = (base* height)/2;
        System.out.println("Площадь треугольника равна: " + area);
        int num;
        System.out.println("Введите число: ");

        //Введенное пользователем число в консоле хранится в переменной num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        // Если число делится на 2, то это четное число, иначе - нечетное
        // если остаток от деления равен нулю, то четное
        if ( num % 2 == 0 )
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
        int hi;
        System.out.println("Введите число: ");

        //Введенное пользователем число в консоле хранится в переменной num
        Scanner hello = new Scanner(System.in);
        hi = hello.nextInt();

        // Если число делится на 2, то это четное число, иначе - нечетное
        // если остаток от деления равен нулю, то четное
        if ( hi % 2 == 0 )
            System.out.println("Число целое");
        else
            System.out.println("Число нецелое");
    }
}
