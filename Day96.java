import java.util.Scanner;
public class Day96 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan a: ");
        int a = sc.nextInt();
        System.out.print("Masukkan b: ");
        int b = sc.nextInt();
        hasil(a,b);
    }
    public static void hasil(int a, int b){
        System.out.println("Hasil penjumlahan a+b = "+(a+b));
        System.out.println("Hasil pengurangan a-b = "+(a-b));
        System.out.println("Hasil perkalian a*b = "+(a*b));
        System.out.println("Hasil pembagian a/b = "+(a/b));
   
    }
}
