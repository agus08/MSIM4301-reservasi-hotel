/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_1_msim4301;

import java.util.Scanner;

/**
 *
 * @author ghozi
 */
public class Tugas_1_msim4301 {

    /**
     * @param args the command line arguments
     */
    static Kamar[] daftarKamar = new Kamar[5];
    public static void main(String[] args) {
        inisialisasiKamar();
        tampilkanDaftarKamar();
        prosesReservasi();
    }
    
    static void inisialisasiKamar() {
        daftarKamar[0] = new Kamar("101", "Standar", 200000, true);
        daftarKamar[1] = new Kamar("102", "Superior", 300000, true);
        daftarKamar[2] = new Kamar("103", "Deluxe", 400000, true);
        daftarKamar[3] = new Kamar("104", "Suite", 500000, true);
        daftarKamar[4] = new Kamar("105", "Standar", 200000, false); // sudah dibooking
    }

    static void tampilkanDaftarKamar() {
        System.out.println("Daftar Kamar Tersedia:");
        for (Kamar kamar : daftarKamar) {
            if (kamar.tersedia) {
                System.out.println("Nomor: " + kamar.nomorKamar + ", Tipe: " + kamar.tipeKamar +
                        ", Harga: Rp" + kamar.hargaPerMalam + "/malam");
            }
        }
    }

    static void prosesReservasi() {
        Scanner input = new Scanner(System.in);
        Kamar[] kamarDipilih = new Kamar[3];
        int[] lamaInap = new int[3];
        int totalKamar = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan nomor kamar (atau kosongkan untuk berhenti): ");
            String no = input.nextLine();
            if (no.equals("")) break;

            Kamar kamar = cariKamar(no);
            if (kamar != null && kamar.tersedia) {
                kamarDipilih[totalKamar] = kamar;
                System.out.print("Masukkan lama menginap (malam): ");
                lamaInap[totalKamar] = Integer.parseInt(input.nextLine());
                kamar.tersedia = false;
                totalKamar++;
            } else {
                System.out.println("Kamar tidak tersedia.");
            }
        }

        hitungDanCetakStruk(kamarDipilih, lamaInap, totalKamar);
    }

    static Kamar cariKamar(String nomor) {
        for (Kamar kamar : daftarKamar) {
            if (kamar.nomorKamar.equals(nomor)) return kamar;
        }
        return null;
    }

    static void hitungDanCetakStruk(Kamar[] kamarDipilih, int[] lamaInap, int totalKamar) {
        double total = 0;
        double layanan = totalKamar * 50000;

        System.out.println("\n======= STRUK RESERVASI =======");
        for (int i = 0; i < totalKamar; i++) {
            double harga = kamarDipilih[i].hargaPerMalam;
            double subtotal = harga * lamaInap[i];
            System.out.println("Kamar " + kamarDipilih[i].nomorKamar +
                    " (" + kamarDipilih[i].tipeKamar + "), " +
                    lamaInap[i] + " malam x Rp" + harga + " = Rp" + subtotal);
            total += subtotal;
        }

        double pajak = total * 0.10;
        double totalSebelumDiskon = total + pajak + layanan;
        double diskon = 0;
        boolean gratisSarapan = false;

        if (total >= 500000) {
            diskon = totalSebelumDiskon * 0.15;
        } else if (total >= 300000) {
            gratisSarapan = true;
        }

        double totalAkhir = totalSebelumDiskon - diskon;

        System.out.println("\nSubtotal: Rp" + total);
        System.out.println("Pajak (10%): Rp" + pajak);
        System.out.println("Biaya Layanan: Rp" + layanan);
        if (diskon > 0) {
            System.out.println("Diskon 15%: -Rp" + diskon);
        }
        if (gratisSarapan) {
            System.out.println("Bonus: Gratis sarapan untuk semua tamu!");
        }
        System.out.println("TOTAL BAYAR: Rp" + totalAkhir);
    }
}
