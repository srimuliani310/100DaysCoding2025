import java.util.Scanner;
    public class main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //input nilai
            System.out.print("Masukkan nama : ");
            String nama = input.nextLine();
            System.out.print("Masukkan umur : ");
            byte umur = input.nextByte();
            System.out.print("Masukkan Tanggal Lahir : ");
            short tanggalLahir = input.nextShort();
            System.out.print("Masukkan Tahun Lahir : ");
            int tahunLahir = input.nextInt();
            System.out.print("Masukkan No Telpon : ");
            long nomorTelpon = input.nextLong();
            System.out.print("Masukkan Berat Badan : ");
            float beratBadan = input.nextFloat();
            System.out.print("Masukkan Tinggi Badan : ");
            double tinggiBadan = input.nextDouble();
            System.out.print("Masukkan Golongan Darah : ");
            char golonganDarah = input.next().charAt(0);
            System.out.print("Apakah saya mahasiswa : ");
            boolean Status = input.nextBoolean();

            //output
            System.out.println("\nNama \t: "+nama);
            System.out.println("Umur \t: "+umur+ " Tahun");
            System.out.println("Tanggal Lahir \t: "+tanggalLahir);
            System.out.println("Tahun lahir \t: "+tahunLahir);
            System.out.println("No telpon \t: "+nomorTelpon);
            System.out.println("Berat Badan \t: "+beratBadan+ " Kg");
            System.out.println("Tinggi Badan \t: "+tinggiBadan+ " cm");
            System.out.println("Golongan Darah \t: "+golonganDarah);
            System.out.println("Status Mahasiswa :"+Status);

        }
    }
