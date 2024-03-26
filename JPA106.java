import java.util.Scanner;

public class JPA106 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入一個正整數: ");
        int num = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.printf("%d 的階乘為 %d\n", num, factorial);
    }
}
