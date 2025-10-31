import java.util.Scanner;
public class Day54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("");      
}
}
