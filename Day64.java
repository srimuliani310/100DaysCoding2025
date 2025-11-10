import java.util.Scanner;
public class Day64 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("M: ");
        int m = sc.nextInt();
        System.out.print("N: ");
        int n = sc.nextInt();
        int hasil = 1;
        for(int i = 1; i<=n; i++){
            hasil *= m;
        }
        System.out.println(m+" pangkat "+n+" = "+hasil);
    }
}
