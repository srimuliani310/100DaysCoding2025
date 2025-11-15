import java.util.Scanner;
public class Soal1E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            int angka = sc.nextInt();
            if(angka>0){
                jumlah+=angka;
            }
        }
        System.out.println(jumlah);
    }
}
