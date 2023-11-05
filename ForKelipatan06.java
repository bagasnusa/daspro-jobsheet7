import java.util.Scanner;
public class ForKelipatan06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int kelipatan,total,counter;
        kelipatan = 0;
        total = 0;
        counter = 0;
        double rata_rata = 0;
        double totalRata = 0;


        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();
        for (int i = 1;i <=50; i++)  {
            if (i % kelipatan == 0) {
                total +=i;
                counter++;
        rata_rata =(double)total/counter;
        totalRata += rata_rata;

            }
        }
         System.out.printf("Banyak bilangan %d dari 1 sampai 50 adalah %d\n",kelipatan,counter);
         System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
         System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rata_rata);
         System.out.printf("Rata-rata dari seluruh bilangan kelipatan adalah %.2f\n", totalRata / counter);
        }
}


