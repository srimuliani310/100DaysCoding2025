package lathiancoding;
import java.util.Scanner;
public class Day62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hasil = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if(i<n){
                System.out.print("+");
            }
            hasil+=i;
        }
        System.out.println(" = "+hasil);
    }
}
