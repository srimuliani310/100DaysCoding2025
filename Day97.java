import java.util.Scanner;
public class Day97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi: ");
        int s = sc.nextInt();
        LPersegi(s);
    }
    public static int LPersegi(int s){
        int luas = s*s;
        System.out.println("Luas: "+luas);
        return luas;
    }
}
