package Day12.java;

import java.util.Scanner;

public class Biodata {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        //input nilai
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM : ");
        String nim = input.nextLine();
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Tanggal Lahir : ");
        String tanggalLahir = input.nextLine();
        System.out.print("Berat Badan : ");
        float beratBadan = input.nextFloat();
        System.out.print("Tinggi Badan : ");
        double tinggiBadan = input.nextDouble();
        System.out.print("Golongan Darah : ");
        char golonganDarah = input.next().charAt(0);
      
        //output
        System.out.println("\nNama \t\t: "+nama);
        System.out.println("NIM \t\t: "+nim);
        System.out.println("Alamat \t\t: "+alamat);
        System.out.println("Tanggal Lahir \t: "+tanggalLahir);
        System.out.println("Berat Badan \t: "+beratBadan+ " Kg");
        System.out.println("Tinggi Badan \t: "+tinggiBadan + " Cm");
        System.out.println("Golongan Darah \t: "+golonganDarah);
        
    } 
}
