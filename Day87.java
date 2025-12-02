import java.util.Scanner;
public class Day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Cari: ");
        int cari = sc.nextInt();
        boolean cek = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == cari){
                System.out.println("Angka ditemukan");
                cek = true;
                break;
            }
        }if(!cek){
            System.out.println("Angka tidak ditemukan");
        }
    }
}
