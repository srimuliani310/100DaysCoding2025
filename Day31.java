import java.util.Scanner;
public class perbandingan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan umur : ");
        int u = sc.nextInt();
        
        if(u>=0 && u<=12){
            System.out.println("Anak-anak");
        }else if(u>=13 && u<=17){
            System.out.println("Remaja");
        }else if(u>=18){
            System.out.println("Dewasa");
        }else{
            System.out.println("Input tidak valid"); //
        }
    }
           }
