import java.util.Scanner;
public class Day70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang: ");
        int p = sc.nextInt();
        System.out.print("Lebar: ");
        int l = sc.nextInt();
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= l; j++) {
            System.out.print(i+" ");
            }
            System.out.println("");
        }
}
}
