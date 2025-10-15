import java.util.Scanner;
public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Angka: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Bilangan Positif");
        }else if(a<0){
            System.out.println("Bilangan negatif");
        }else{
            System.out.println("Nol");
        }
    }
        }
