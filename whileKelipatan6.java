import java.util.Scanner;

public class WhileKelipatan06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int kelipatan, total, counter;
        kelipatan = 0;
        total = 0;
        counter = 0;
        double rata_rata = 0;
        double totalRata = 0;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        int i = 1; // Inisialisasi nilai awal untuk perulangan while
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
                rata_rata = (double) total / counter;
                totalRata += rata_rata;
            }
            i++; // Inkrementasi nilai i
        }

        System.out.printf("Banyak bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rata_rata);
        System.out.printf("Rata-rata dari seluruh bilangan kelipatan adalah %.2f\n", totalRata / counter);
    }
}
