import java.util.Scanner;

public class JPA103 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        double average = (num1 + num2 + num3) / 3.0;

        System.out.printf("Average: %.2f\n", average);
    }
}
