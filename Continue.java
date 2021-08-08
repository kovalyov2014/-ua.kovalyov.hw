import java.util.Scanner;
        public class Continue {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                System.out.print(input);
                StringBuilder inputBuilder = new StringBuilder();
                inputBuilder.append(input);
                inputBuilder.reverse();
                System.out.println(inputBuilder);
            }
        }
