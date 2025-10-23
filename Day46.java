import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Ayam Goreng  - Rp15,000");
        System.out.println("2. Ayam Geprek  - Rp10,000");
        System.out.println("3. Mie Ayam     - Rp17,000");
        System.out.println("4. Sate Ayam    - Rp20,000");
        System.out.print("Pilih menu: ");
        int pilih = sc.nextInt();
        int harga = 0;
        switch(pilih){
            case 1:
                harga = 15000;
                System.out.println("Ayam Goreng - Rp15,000");
                break;
            case 2:
                harga = 10000;
                System.out.println("Ayam Geprek - Rp10,000");
                break;
            case 3:
                harga = 17000;
                System.out.println("Mie Ayam - Rp17,000");
                break;
            case 4:
                harga = 20000;
                System.out.println("Sate Ayam - Rp20,000");
                break;
            default:
                System.out.println("Menu tidak valid!");
        }
        System.out.printf("Total Harga: %,d\n",harga);
    }
                  }
