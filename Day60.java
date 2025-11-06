public class Day60 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = n; i >= 1; i--) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        for (int i = n; i >= 1; i--) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}
