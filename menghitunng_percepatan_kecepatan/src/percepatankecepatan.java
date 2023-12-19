import java.util.Scanner;

public class percepatankecepatan {
    public static void main(String[] args) {
        //
        Scanner  scanner = new Scanner(System.in);

        //meminta pengguna memasukkan nilai kecepatan awal (v0)
        System.out.print("Masukkan niali keceatan awal (v0) dalam m/s: ");
        double kecepatanAwal = scanner.nextDouble();

        //meminta pengguna memasukkan nilai kecepatan askhir (v)
        System.out.print("Masukkan nilai kecepatan akhir (v) dalam m/s: ");
        double kecepatanAkhir = scanner.nextDouble();

        //meminta penggua memasukkan waktu (t)
        System.out.print("Masukkan nilai waktu (t) dalam detik: ");
        double waktu = scanner.nextDouble();

        //memanggil fungsi unntuk menghitung percepatan
        double percepatan = hitungPercepatan(kecepatanAwal, kecepatanAkhir, waktu);

        //memanggil fungsi untuk menghitung kecepatan rata-rata
        double kecepatanRataRata = hitungKecepatanRataRata(kecepatanAwal, kecepatanAkhir);

        //menampillkan hasil
        System.out.println("percepatan adalah: " + percepatan + "m/s^2.");
        System.out.println("kecepatan adalah: " + kecepatanRataRata + "M/S.");        
    }
    // fungsi untuk menghitung percepatan 
    public static double hitungPercepatan(double kecepatanAwal, double kecepatanAkhir, double waktu) {
        return (kecepatanAkhir - kecepatanAwal) / waktu;
    }
    //fungsi untuk menghitung kecepata rata-rata
    public static double hitungKecepatanRataRata(double kecepatanAwal, double kecepatanAkhir) {
        return (kecepatanAwal + kecepatanAkhir) / 2;
    }
}
