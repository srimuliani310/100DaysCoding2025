import java.util.Scanner;
public class day55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("");
            int a = sc.nextInt();
            total += a;
        }
        System.out.println(total+" kg");
    }
}
