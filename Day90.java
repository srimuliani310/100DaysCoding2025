import java.util.Scanner;
public class Day90 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(kelilingPersegi(s));
    }
    public static int kelilingPersegi(int s){
        return 4*s;
    }
}
