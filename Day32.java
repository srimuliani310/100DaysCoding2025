import java.util.Scanner;
public class Day32 {
    public static void main(String[] args) {
        String userB = "admin";
        String passB = "12345";
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usr = sc.nextLine();
        System.out.print("Masukkan password: ");
        String pass = sc.nextLine();
        
        if(usr.equalsIgnoreCase(userB) || pass.equalsIgnoreCase(passB)){
            System.out.println("Login gagal");
        }else{
            System.out.println("Login berhasil");
        }
    }
              }
