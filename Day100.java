import java.util.*;
public class Day100 {
 static Integer[] hashArray;
 static int retas(int[] arr){
     int n = arr.length;
     hashArray = new Integer[n];
     int pergeseran = 0;
     for(int x : arr){
         int idx = x%n;
         while(hashArray[idx] != null){
             idx = (idx +1)%n;
             pergeseran++;
         }
         hashArray[idx] = x;
     }
     return pergeseran;
 }

 static String susunKode(int p){
     int n = hashArray.length;
     int panjang = hashArray[p % n];
     StringBuilder dasar = new StringBuilder();
     for(int x : hashArray){
         dasar.append(x);
     }
     StringBuilder hasil = new StringBuilder();
     while(hasil.length() < panjang){
         hasil.append(dasar);
     }
     return hasil.substring(0,panjang);
 }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int p = retas(arr);
        String kode = susunKode(p);
        System.out.println("Pergeseran: "+p);
        System.out.println("Panjang sandi yang dikembalikan: "+kode);
    
}
}
