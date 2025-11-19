import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;
        int a = 0;
        while(a>=0){
            a = sc.nextInt();
            if(a>=0){
                jumlah+=a;
            }
        }
        System.out.println(jumlah);
    }
}
