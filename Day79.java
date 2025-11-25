import java.util.Scanner;
public class Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uB = "admin";
        String pB = "admin123";
        boolean cek = false;
        while(!cek){
            System.out.print("Username: ");
            String user = sc.nextLine();
            System.out.print("Password: ");
            String pass = sc.nextLine();
            if(user.equalsIgnoreCase(uB) && pass.equalsIgnoreCase(pB)){
                cek = true;
                System.out.println("Login berhasil!");
                break;
            }else{
            System.out.println("Login gagal!, coba lagi");
        }
        }
       
    }
}
