import java.util.Scanner;
public class Day92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = sc.nextInt();
        LPersegiPanjang(p,l);
    }
    public static int LPersegiPanjang(int p, int l){
        int luas = p*l;
        System.out.println("Luas: "+luas);
        return luas;
    }
}
