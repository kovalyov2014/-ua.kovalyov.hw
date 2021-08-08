import java.util.Date;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Kovalyov");
        System.out.println("Vitaliy");
        Date date = new Date();
        System.out.println(date);
        String str = "Виталий";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nСтрока до реверса: " + str);
        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
    }

}

