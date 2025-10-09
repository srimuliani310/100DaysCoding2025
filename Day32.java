import java.util.Scanner;
public class Day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int uas = sc.nextInt();
        
        if(uts<60 || uas<60){
            System.out.println("Anda boleh mengikuti ujian susulan");
        }else{
            System.out.println("Anda tidak perlu mengikuti ujian susulan");
        }
    }
}
