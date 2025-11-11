package Day66;
import java.util.Scanner;
public class Day66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int angka = sc.nextInt();
        int hasil = 1;
        System.out.print(angka+"! = ");
        for (int i = angka; i >= 1; i--) {
            System.out.print(i);
            if(i>1){
                System.out.print("x");
            }
            hasil *= i;
        }
        System.out.print(" = "+hasil+"\n");
    }
}
