import java.util.Scanner;
public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("     === MENU MAKANAN ===\n");
        System.out.println("1. Ayam Goreng  - Rp15,000.00");
        System.out.println("2. Ayam Geprek  - Rp10,000.00");
        System.out.println("3. Mie Ayam     - Rp17,000.00");
        System.out.println("4. Sate Ayam    - Rp20,000.00\n");
        System.out.print("Pilih menu: ");
        int pilih = sc.nextInt();
        System.out.print("Jumlah pesanan: ");
        int jml = sc.nextInt();
        double totalBayar = 0;
        switch(pilih){
            case 1:
                totalBayar = jml*15000;
                System.out.println("Ayam Goreng - Rp15,000.00");
                break;
            case 2:
                totalBayar = jml*10000;
                System.out.println("Ayam Geprek - Rp10,000.00");
                break;
            case 3:
                totalBayar = jml*17000;
                System.out.println("Mie Ayam - Rp17,000.00");
                break;
            case 4:
                totalBayar = jml*20000;
                System.out.println("Sate Ayam - Rp20,000.00");
                break;
            default:
                System.out.println("Menu tidak valid!");
        }
        System.out.printf("Total Harga: Rp%,.2f\n",totalBayar);
    }
}
