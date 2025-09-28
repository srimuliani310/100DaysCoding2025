public class Main {
    public static void main(String [] args) {
        int v1 = 45;
        int v2 = 5;
        System.out.println("Sebelum :\n"+"v1 = "+v1+"\nv2 = "+v2);
        v1 = v1+v2;
        v2 = v1-v2;
        v1 = v1-v2;
        System.out.println("\nSetelah :\n"+"v1 = "+v1+"\nv2 = "+v2);
    }    
          }
