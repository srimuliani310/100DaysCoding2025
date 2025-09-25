public class Main {
    public static void main(String [] args) {
        byte a = 18; 
        short b = a;   
        int c = b;      
        long d = c;     
        float e = d;    
        double f = e;   
        
        System.out.println("\nByte ke Short : " + b);
        System.out.println("Short ke Int : " + c);
        System.out.println("Int ke Long : " + d);
        System.out.println("Long ke Float : " + e);
        System.out.println("Float ke Double : " + f);
    }     
}
