public class Day63 {
    public static void main(String[] args) {
        int n = 5;
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if(i<n){
                System.out.print("x");
            }
            hasil *= i;
        }
        System.out.println(" = "+hasil); 
    }
}
