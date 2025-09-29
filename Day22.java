import java.util.Scanner;
public class luasPersegi {
    public static void main(String[] args){
        // L = s x s
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        int s = sc.nextInt();
        System.out.println("Luas = "+s*s);
    }
}
