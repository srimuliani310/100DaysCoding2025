public class Day86 {
    public static void main(String[] args) {
        int a[] = {52, 10, 5, 32, 15};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Min: "+min);
    }
}
