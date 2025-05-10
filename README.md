# 🏨 Aplikasi Reservasi Hotel - Java Desktop

Tugas Praktik 1 Mata Kuliah **Pemrograman Berbasis Desktop**  
Universitas Terbuka – 2025.1

## 📚 Deskripsi

Aplikasi ini merupakan simulasi **reservasi hotel berbasis teks** yang dikembangkan menggunakan bahasa pemrograman **Java**. Aplikasi ini dapat melakukan:
- Input data kamar hotel
- Pemesanan maksimal 3 kamar
- Perhitungan total biaya dengan pajak, layanan, dan diskon
- Pencetakan struk reservasi ke layar

Aplikasi dikembangkan menggunakan **NetBeans IDE**, tanpa menggunakan perulangan (loop), sesuai instruksi tugas.

---

## ✨ Fitur Utama

1. **Data Kamar Hotel**
   - Disimpan dalam array objek
   - Tipe kamar: Standar, Superior, Deluxe, Suite
   - Informasi: nomor kamar, tipe, harga, status ketersediaan

2. **Pemesanan Kamar**
   - Pelanggan dapat memilih hingga 3 kamar
   - Input nomor kamar dan lama menginap
   - Hanya kamar yang tersedia dapat dipesan

3. **Perhitungan Biaya**
   - Biaya kamar berdasarkan harga dan jumlah malam
   - Pajak 10% dan biaya layanan Rp 50.000/kamar
   - Diskon 15% jika total > Rp 500.000
   - Gratis sarapan jika total > Rp 300.000

4. **Struk Reservasi**
   - Menampilkan detail setiap kamar yang dipesan
   - Menunjukkan rincian biaya, pajak, layanan, diskon, dan total bayar

---

## 🛠️ Struktur Program

- `Kamar.java`: Class untuk merepresentasikan data kamar hotel
- `Main.java`: Logika utama aplikasi, berisi method:
  - `inisialisasiKamar()`
  - `tampilkanDaftarKamar()`
  - `prosesReservasi()`
  - `cariKamar()`
  - `hitungDanCetakStruk()`

---

## 🚀 Cara Menjalankan

1. Buka proyek di **NetBeans IDE**
2. Pastikan file `Kamar.java` dan `Main.java` berada dalam package yang sama
3. Jalankan file `Main.java`
4. Ikuti instruksi input pada terminal

---

## 👨‍🎓 Tujuan Pembelajaran

- Menerapkan class, object, method, dan array
- Memproses data menggunakan struktur keputusan (if, nested if, switch-case)
- Mengelola data dalam bentuk teks di lingkungan desktop Java

---

## 📝 Catatan

- Tidak menggunakan perulangan (loop), seluruh input dikontrol dengan batas maksimal 3 kamar
- Kode ini bersifat **console-based**, namun bisa dikembangkan lebih lanjut menggunakan **Swing GUI**

---

