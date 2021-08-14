import java.util.Scanner;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        int[] mas1 = new int[400];
        int[] mas2 = new int[400];
        for (int i = 0; i < 400; i++) {
            mas1[i] = (int) (Math.random() * 401);
            mas2[i] = (int) (Math.random() * 401);
        }
        System.out.println(Arrays.toString(mas1));
        double average1 = 0;
        double average2 = 1;
        for (int i = 0; i < 400; i++) {
            average1 += mas1[i];
            average2 *= mas2[i];
        }
        average1 /= 400;
        average2 /= 400;
        System.out.println("Cреднее арифметическое " + average1);
        System.out.println("Cреднее геометрическое " + average2);

        Scanner str = new Scanner(System.in);
        System.out.print("enter n =");
        int n;
        int[] a;
        n = str.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("vvedite chislo massiva + a[" + i + "]=");
            a[i] = str.nextInt();
            for (int j = 2; (a[i] % j) > 0; j++) {
                if (j == a[i]) {
                    System.out.println(a[i] + "  ");

                }
            }
        }
    }
}
