import java.util.Scanner;
public class percabanganIf {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();
        if(umur >=18) {
        System.out.println("Dewasa");
        }else if (umur > 12 && umur < 18){
        System.out.println("Remaja");
        }else {
        System.out.println("Anak-anak");
        }
  }
}
