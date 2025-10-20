import java.util.Scanner;
public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bil = sc.nextInt();
        if(bil%3==0 && bil%5==0){
            System.out.println("Kelipatan 3 dan 5");
        }else if(bil%3==0){
            System.out.println("Kelipatan 3");
        }else if(bil%5==0){
            System.out.println("Kelipatan 5");
        }else{
            System.out.println("Bukan kelipatan 3 atau 5");
        }
    }
              }
