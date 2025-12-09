import java.util.Scanner;
public class Day93 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Math ceil: "+(int)Math.ceil(a));
        System.out.println("Math floor: "+(int)Math.floor(a));
        System.out.println("Math round: "+(int)Math.round(a));
    }
}
