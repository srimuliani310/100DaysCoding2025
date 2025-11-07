import java.util.Scanner;
public class Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kelipatan: ");
        int m = sc.nextInt();
        System.out.print("N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%m==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
         
    }
}
