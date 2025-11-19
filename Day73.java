import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;
        for (int i = 1; i <= 10; i++) {
            int a = sc.nextInt();
            if(a<0){
                break;
            }
            jumlah +=a;
        }
        System.out.println(jumlah);
    }
}
