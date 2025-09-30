import java.util.Scanner;
public class persegiPanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Luas = p x l
        System.out.print("Masukkan p = ");
        int p = sc.nextInt();
        System.out.print("Masukkan l = ");
        int l = sc.nextInt();
        int L = p*l;
        System.out.println("Luas = "+ L);
        
    }
}
