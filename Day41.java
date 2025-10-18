import java.util.Scanner;
public class Day41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Harga barang: ");
        String harga = sc.nextLine();
        System.out.print("Jumlah barang: ");
        String jumlah = sc.nextLine();
        
        int strh = Integer.parseInt(harga);
        int strj = Integer.parseInt(jumlah);
        
        int totalBayar = strh*strj;
        
        System.out.println("Total bayar: "+totalBayar);
    }
}
