import java.util.Scanner;
public class prima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean prima = true;
            for (int j = 2; j <= i/2; j++) {
                if(i%j==0){
                    prima = false;
                    break;
                }
            }
            if(prima){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
}
}
