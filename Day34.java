import java.util.Scanner;
public class kombinasi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        System.out.print("Kehadiran: ");
        int kehadiran = sc.nextInt();
        System.out.print("Aktif organisasi: ");
        boolean aktif = sc.nextBoolean();
        if((ipk>=3.5 && kehadiran>=90) || (ipk>=3.0 && aktif==true)){
            System.out.println("Layak mendaftar beasiswa");
        }else{
            System.out.println("Tidak layak mendaftar beasiswa");
        }
    }
}
