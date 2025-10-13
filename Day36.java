import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Nama mahasiswa: ");
         String nama = sc.nextLine();
         System.out.print("Nilai ujian mahasiswa: ");
         int nilai = sc.nextInt();
         
         if(nilai>=60){
             System.out.println(nama+" dinyatakan LULUS");
             if(nilai>=85){
                 System.out.println("Predikat: Sangat Baik");
             }else if(nilai>=70 && nilai<85){
                 System.out.println("Predikat: Baik");
             }else if (nilai<70){
                 System.out.println("Predikat: Cukup");
             }
         }else{
             System.out.println(nama+"dinyatakan TIDAK LULUS");
             System.out.println("Predikat: Kurang");
         }
            
    }
}
