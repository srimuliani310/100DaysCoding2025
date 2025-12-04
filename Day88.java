import java.util.Scanner;
public class Day88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
