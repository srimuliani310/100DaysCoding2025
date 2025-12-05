import java.util.Scanner;
public class Day89 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = sc.nextInt();
        GG(a);
    }
    public static void GG(int a){
        if(a%2==0){
            System.out.println(a+" adalah angka genap");
        }else{
            System.out.println(a+" adalah angka ganjil");
        }
    }
    
}
