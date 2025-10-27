import java.util.Scanner;
public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bil = sc.nextInt();
        String hasil = (bil>0)? "Positif" : "Negatif";
        System.out.println(hasil);
    }
}
