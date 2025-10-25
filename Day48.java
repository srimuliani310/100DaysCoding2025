import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan operator: ");
        char op = sc.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        int hasil = 0;
        switch(op){
            case '+':
                hasil = a+b;
                System.out.println(a+" "+op+" "+b+" = "+hasil);
                break;
            case '-':
                hasil = a-b;
                System.out.println(a+" "+op+" "+b+" = "+hasil);
                break;
            case '*':
                hasil = a*b;
                System.out.println(a+" "+op+" "+b+" = "+hasil);
                break;
            case '/':
                    hasil = a/b;
                    System.out.println(a+" "+op+" "+b+" = "+hasil);
                break;
            case '%':
                hasil = a%b;
                System.out.println(a+" "+op+" "+b+" = "+hasil);
                break;
            default:
                System.out.println("Operator tidak valid!");
        }
    }
}
