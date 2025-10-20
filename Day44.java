import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai: ");
        int nilai = sc.nextInt();
        if (nilai >= 90) {
            System.out.println("Predikat A");
            if (nilai == 100) {
                System.out.println("Sempurna");
            }
        } else if (nilai >= 80 && nilai <= 89) {
            System.out.println("Predikat B");
        } else if (nilai >= 70 && nilai <= 79) {
            System.out.println("Predikat C");
        } else if (nilai >= 60 && nilai <= 69){
            System.out.println("Predikat D");
        }else{
            System.out.println("Predikat E");
        }
    }
}
