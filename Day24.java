import java.util.Scanner;
public class luasLingkaran {
    public static void main(String[] args){
        //Luas Lingkaran = πr²
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan r : ");
        byte r = sc.nextByte();
        final double PI = 3.14;
        double L = PI*r*r;
        System.out.println("Luas Lingkaran = "+L);
    }
}
