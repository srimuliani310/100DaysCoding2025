package Day16;
import java.util.Scanner;
public class OperatorAritmatika2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai a = ");
        int a = sc.nextInt();
        System.out.print("Masukkan nilai b = ");
        int b = sc.nextInt();
        int hasil = a*b;
        System.out.println("Nilai a = "+a);
        System.out.println("Nilai b = "+b);
        System.out.println("Hasil a x b = " + hasil);
        
        hasil = (a/b);
        System.out.println("\nNilai a = "+a);
        System.out.println("Nilai b = "+b);
        System.out.println("Hasil a / b = " + hasil);
    }
}
