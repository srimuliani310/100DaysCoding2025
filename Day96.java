package LatihanMengulangSoal;
import java.util.Scanner;
public class Day96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan a: ");
        int a = sc.nextInt();
        System.out.print("Masukkan b: ");
        int b = sc.nextInt();
        System.out.println("Hasil penjumlahan: "+penjumlahan(a,b));
        System.out.println("Hasil pengurangan: "+pengurangan(a,b));
        System.out.println("Hasil perkalian: "+perkalian(a,b));
        System.out.println("Hasil pembagian: "+pembagian(a,b));
    }
    public static int penjumlahan(int a, int b){
        return a+b;
    }  
    public static int pengurangan(int a, int b){
        return a-b;
    }  
    public static int perkalian(int a, int b){
        return a*b;
    }  
    public static int pembagian(int a, int b){
        return a/b;
    }  
    
}
