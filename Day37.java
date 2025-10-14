import java.util.Scanner;
public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        int b = sc.nextInt();
        if(b%2==0){
            System.out.println("Bilangan genap");
        }else{
            System.out.println("Bilangan Ganjil");
        }
    }
}
