public class primitifToString {
    public static void main(String[] args) {
        int angka = 50;
        double nilai = 99.99;
        boolean status = true;
        /*
        Yang umum digunakan 
        String.valueOf(data);
        TipeData.toString(data);
        data + "";
        */
        String s1 = String.valueOf(angka);
        String s2 = Double.toString(nilai);
        String s3 = status + "";
       
        System.out.println("Int ke String = "+s1);
        System.out.println("Double ke String = "+s2);
        System.out.println("Boolean ke String = "+s3);
    }
   
                                   }
