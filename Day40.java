import java.util.Scanner;
public class Day40 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int angka1, angka2, hasil;
        char op = 0;
        System.out.print("Masukkan angka ke-1: ");
        angka1 = sc.nextInt();
        
            System.out.print("Masukkan operator: ");
            op = sc.next().charAt(0);
            
            System.out.print("Masukkan angka ke-2: ");
            angka2 = sc.nextInt();
        hasil = 0;
            if(op == '+'){
                hasil = angka1+angka2;
                System.out.println(angka1+" "+op+" "+angka2+" = "+hasil);
            }else if(op == '-'){
                hasil = angka1-angka2;
                System.out.println(angka1+" "+op+" "+angka2+" = "+hasil);
            }else if(op == '*'){
                hasil = angka1*angka2;
                System.out.println(angka1+" "+op+" "+angka2+" = "+hasil);
            }else if (op == '/'){
                if (angka2!=0){
                hasil = angka1/angka2;
                System.out.println(angka1+" "+op+" "+angka2+" = "+hasil);
                }else{
                    System.out.println("Kesalahan");
                }
            }else{
                System.out.println("Operator tidak valid!");
            }
    }
}
