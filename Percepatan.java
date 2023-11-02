

import java.util.Scanner;

public class Percepatan {
    double waktu;
    double kecepatanAwal;
    double kecepatanAkhir;

    /**
     *
     * @param waktu
     * @param kecepatanAwal
     * @param kecepatanAkhir
     */
    public Percepatan(double waktu, double kecepatanAwal, double kecepatanAkhir) {
        this.waktu = waktu;
        this.kecepatanAwal = kecepatanAwal;
        this.kecepatanAkhir = kecepatanAkhir;
    }

    /**
     *
     * @return
     */
    public double getWaktu() {
        return waktu;
    }

    /**
     *
     * @return mengembalikan nilai kecepatanAwal
     */
    public double getKecepatanAwal() {
        return kecepatanAwal;
    }

    /**
     *
     * @return mengembalikan nilai kecepatanAkhir
     */
    public double getKecepatanAkhir() {
        return kecepatanAkhir;
    }

    public double hitungPercepatan() {
        return (kecepatanAkhir - kecepatanAwal) / waktu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aplikasi ini digunakan untuk menghitung percepatan");
        System.out.print("Masukkan nilai waktu (dalam detik): ");
        double waktu = sc.nextDouble();
        System.out.print("Masukkan nilai kecepatan awal (dalam m/s): ");
        double kecepatanAwal = sc.nextDouble();
        System.out.print("Masukkan nilai kecepatan akhir (dalam m/s): ");
        double kecepatanAkhir = sc.nextDouble();

        Percepatan percepatan = new Percepatan(waktu, kecepatanAwal, kecepatanAkhir);
        double percepatanNilai = percepatan.hitungPercepatan();

        System.out.println("Percepatan adalah: " + percepatanNilai + " m/s^2");
    }
}