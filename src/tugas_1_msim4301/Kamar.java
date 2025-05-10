/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_1_msim4301;

/**
 *
 * @author ghozi
 */
public class Kamar {
    String nomorKamar;
    String tipeKamar;
    double hargaPerMalam;
    boolean tersedia;

    public Kamar(String nomorKamar, String tipeKamar, double hargaPerMalam, boolean tersedia) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.tersedia = tersedia;
    }
}