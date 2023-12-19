import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        //membuat objek scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        //meminta pengguna memasukkan sebuah bilangan
        System.out.print("Masukkan sebuah bilanan: ");
        int bilangan = scanner.nextInt();

        //memanggil fungsi untuk mengecek apakah suatu bilangan ganjil atau genap 
        cekGanjilGenap(bilangan);
    }
    //fungsi untuk mengecek apakah suatu bilangan ganjil atau genap
    public static void cekGanjilGenap(int bilangan){
        if (bilangan % 2 == 0){
            System.out.println(bilangan + "adlah bilangan genap.");
        } else {
            System.out.println(bilangan + "adalah bilangan ganjil.");
        }
    }
}
