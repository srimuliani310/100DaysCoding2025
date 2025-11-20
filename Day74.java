import java.util.Scanner;
public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0;
        int a = 0, b = 0, c = 0;
        do {
            System.out.println("\n=== Kalkulator Sederhana ===");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan angka: ");
                    a = sc.nextInt();
                    System.out.print("Masukkan angka: ");
                    b = sc.nextInt();
                    c = a + b;
                    System.out.println(a + " + " + b + " = " + c);
                    break;
                case 2:
                    System.out.print("Masukkan angka: ");
                    a = sc.nextInt();
                    System.out.print("Masukkan angka: ");
                    b = sc.nextInt();
                    c = a - b;
                    System.out.println(a + " - " + b + " = " + c);
                    break;
                case 3:
                    System.out.print("Masukkan angka: ");
                    a = sc.nextInt();
                    System.out.print("Masukkan angka: ");
                    b = sc.nextInt();
                    c = a * b;
                    System.out.println(a + " x " + b + " = " + c);
                    break;
                case 4:
                    System.out.print("Masukkan angka: ");
                    a = sc.nextInt();
                    System.out.print("Masukkan angka: ");
                    b = sc.nextInt();
                    c = a / b;
                    System.out.println(a + " / " + b + " = " + c);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("pilih angka (1-5)");
            }
        } while ( pilih != 5);
    }
}
