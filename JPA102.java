import java.util.Scanner;

public class JPA102 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input: ");
        double kg = scanner.nextDouble();

        double pounds = kg * 2.20462;

        System.out.printf("%.4f kg = %.4f pounds\n", kg, pounds);
    }
}
