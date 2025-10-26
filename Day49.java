import java.util.Scanner;
public class Day49 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Angka: ");
        int angka = sc.nextInt();
        String hasil = (angka%2==0)? "Genap" : "Ganjil";
        System.out.println(hasil);
    }
    
}
