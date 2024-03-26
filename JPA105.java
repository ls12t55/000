import java.util.Scanner;

public class JPA105 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入您的姓名: ");
        String name = scanner.nextLine();

        System.out.print("請輸入銅板的個數: ");
        int num = scanner.nextInt();

        int[] coins = {1, 5, 10, 50};
        int[] counts = new int[coins.length];

        for (int i = 0; i < coins.length; i++) {
            System.out.printf("請輸入 %d 元硬幣的數量: ", coins[i]);
            counts[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0; i < coins.length; i++) {
            total += coins[i] * counts[i];
        }

        System.out.printf("%s, 您存錢筒中的總金額為 %d 元\n", name, total);
    }
}
