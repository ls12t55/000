import java.util.Scanner;

public class JPA107 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入籃球成績: ");
        int basketball = scanner.nextInt();

        System.out.print("請輸入棒球成績: ");
        int baseball = scanner.nextInt();

        System.out.printf("籃球成績為 %d, 棒球成績為 %d\n", basketball, baseball);
    }
}
