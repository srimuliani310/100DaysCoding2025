import java.util.Scanner;
public class evaluasi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah pulsa: ");
        int p = sc.nextInt();
        
        int ht = 10000;
        int ad = 2000;
        int sebelumad = ht*p;
        int sesudahad = sebelumad+2000;
        
        System.out.println("Sebelum: "+sebelumad);
        System.out.println("Sesudah: "+sesudahad);
    }
          }
