import java.util.Scanner;
public class Day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan teks: ");
        String teks1 = sc.nextLine();
        String toLowerCase = teks1.toLowerCase();
        System.out.println("toLowerCase: " + toLowerCase);

        System.out.print("Masukkan teks: ");
        String teks2 = sc.nextLine();
        String replace = teks2.replace("a","e");
        System.out.println("Panjang string: " + replace);
}
}
