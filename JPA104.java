import java.util.Scanner;

public class JPA104 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("輸入第 1 組的 x 和 y 座標: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("輸入第 2 組的 x 和 y 座標: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.printf("介於 (%d, %d) 和 (%d, %d) 之間的距離是 %.2f\n", x1, y1, x2, y2, distance);
    }
}
