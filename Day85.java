public class Day85 {
    public static void main(String[] args) {
        int a[] = {7, 10, 25, 32, 15};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Max: "+max);
    }
}
