import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gaji Pokok: ");
        int gajiPokok = sc.nextInt();
        System.out.print("Tunjangan: ");
        int tunjangan = sc.nextInt();
        sc.nextLine();
        System.out.print("Potongan BPJS: ");
        int potongan = sc.nextInt();
        
        int bonus = 0;
        if(gajiPokok >= 5000000){
            bonus = 500000;
        }else{
            bonus = 250000;
        }
        
        int gajiBersih = gajiPokok+tunjangan+bonus-potongan;
        System.out.println("Gaji pokok      : Rp"+gajiPokok);
        System.out.println("Tunjangan       : Rp"+tunjangan);
        System.out.println("Bonus           : Rp"+bonus);
        System.out.println("Potongan        : Rp"+potongan);
        System.out.println("Gaji Bersih     : Rp"+gajiBersih);
        
    }
}
