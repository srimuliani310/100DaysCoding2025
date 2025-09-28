public class Main {
    public static void main(String [] args) {
        int a = 45, b = 5;
        System.out.println("Sebelum :\n"+"a = "+a+"\nb = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("\nSetelah :\n"+"a = "+a+"\nb = "+b);
    }    
}
