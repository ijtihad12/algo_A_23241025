import java.util.Scanner;

public class diameterbola {
    public static void main(String[] args) {
        //membuat objek scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        //meminta pengguna memasukkan panjang jari-jari bola
        System.out.print("Masukkan panjang jari-jari bola (dalam satuan meter): ");
        double JariJari = scanner.nextDouble();

        //memanggil fungsi untuk menghitung volume bola
        double volume =hitungVolumeBola(JariJari);
        
        //menampilkan hasil 
        System.out.println("volume bola adalah: " + volume + "meter kubik.");
    }
    // fungsi utuk menghitung volume bola berdasarkan jari-jari
    public static double hitungVolumeBola(double JariJari) {
        return (4.0 / 3.0) * Math.PI * Math.pow(JariJari, 3);
    }
}
