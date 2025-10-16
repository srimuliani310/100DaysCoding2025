import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        System.out.println("\n=== MENU MAKANAN ===\n");
        System.out.println("1. Bakso Biasa      Rp12,000.00");
        System.out.println("2. Bakso Jumbo      Rp18,000.00");
        System.out.println("3. Mie Ayam         Rp16,000.00");
        System.out.println("4. Mie Pangsit      Rp13,000.00\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama     : ");
        String nama = sc.nextLine();
        System.out.print("Pilih Menu (1-4)  : ");
        int pilih = sc.nextInt();
        int jumlah = 0;
        
        String menu = "";
        double harga = 0;
        
        if(pilih<1 || pilih >4){
            System.out.println("Menu tidak tersedia!");
            return;
        }else{
            System.out.print("Jumlah porsi      : ");
            jumlah  = sc.nextInt();
            if(pilih == 1){
                menu = "Bakso Biasa";
                harga = 12000;
            }else if(pilih == 2){
                menu = "Bakso Jumbo";
                harga = 18000;
            }else if(pilih == 3){
                menu = "Mie Ayam";
                harga = 16000;
            }else{
                menu = "Mie Pangsit";
                harga = 13000;
            }
        }
        double totalHarga = harga*jumlah;
        System.out.println("\n=== RINCIAN PESANAN ===\n");
        System.out.println("Nama             : "+nama);
        System.out.println("Menu             : "+menu);
        System.out.println("Jumlah Porsi     : "+jumlah);
        System.out.printf("Harga per porsi  : Rp%,.2f\n",harga);
        System.out.printf("Total Harga      : Rp%,.2f\n",totalHarga);
        System.out.println("\nTerima kasih!");
    }
}
