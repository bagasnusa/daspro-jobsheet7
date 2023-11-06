import java.util.Scanner;

public class Whilegajih06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan = 0;
        double totalGajiLembur = 0.0;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;
        int direkturCount = 0;
        do {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            String jabatan = scan.next();

            if (jabatan.equalsIgnoreCase("direktur")) {
                if (direkturCount == 0) {
                    System.out.print("Masukkan jumlah jam lembur: ");
                    int jumlahJamLembur = scan.nextInt();
                    totalGajiLembur +=
                    direkturCount++;
                } else {
                    System.out.println("Anda sudah memasukkan jabatan 'Direktur' sebelumnya.");
                }
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                System.out.print("Masukkan jumlah jam lembur: ");
                int jumlahJamLembur = scan.nextInt();
                double gajiLembur = jumlahJamLembur * 100000;
                totalGajiLembur += gajiLembur;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                System.out.print("Masukkan jumlah jam lembur: ");
                int jumlahJamLembur = scan.nextInt();
                double gajiLembur = jumlahJamLembur * 75000;
                totalGajiLembur += gajiLembur;
            } else {
                System.out.println("Jabatan tidak valid");
            }
            i++;
        } while (i < jumlahKaryawan);
        System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}





        