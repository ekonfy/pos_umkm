# 🛒 POS UMKM (Point of Sale untuk Usaha Mikro, Kecil, dan Menengah)

Aplikasi Point of Sale berbasis Android modern yang dirancang untuk membantu UMKM mengelola transaksi, inventaris, dan laporan penjualan mereka dengan antarmuka yang cepat dan intuitif. Dibangun menggunakan teknologi terbaru Google, **Jetpack Compose**, dan diorganisir menggunakan metodologi **Atomic Design**.

## ✨ Fitur Utama

* **Manajemen Transaksi Cepat:** Antarmuka kasir yang responsif untuk input produk, diskon, dan pilihan pembayaran.
* **Pelacakan Inventaris Real-time:** Memantau stok produk dan memberikan peringatan jika stok menipis.
* **Laporan Penjualan Komprehensif:** Menyediakan ringkasan penjualan harian, mingguan, dan bulanan.
* **Dukungan Multi-Pengguna:** Manajemen peran untuk kasir dan manajer.
* **Mode Offline:** Dapat mencatat transaksi bahkan tanpa koneksi internet.

## 🧱 Arsitektur & Teknologi

Aplikasi ini mengadopsi struktur yang modern dan *scalable* untuk kemudahan pengembangan dan pemeliharaan:

### 1. Jetpack Compose

Seluruh antarmuka pengguna (UI) dibangun menggunakan **Jetpack Compose**. Hal ini memungkinkan pengembangan UI yang deklaratif, efisien, dan memanfaatkan kekuatan modern Kotlin, menghasilkan kode yang lebih sedikit dan lebih mudah dibaca.

### 2. Atomic Design Methodology

Kami menerapkan Atomic Design untuk struktur kode UI kami. Ini memastikan konsistensi desain, kemampuan *reusable* yang tinggi, dan mempermudah kolaborasi tim. 

Struktur kode diatur sebagai berikut:

| Level | Deskripsi | Contoh |
| :--- | :--- | :--- |
| **Atoms** | Komponen UI terkecil yang tidak dapat dipecah lagi. | `Text`, `Button`, `Icon` |
| **Molecules** | Grup *atoms* yang bekerja sama untuk satu fungsi. | `InputField` (terdiri dari Label dan Text Input) |
| **Organisms** | Grup *molecules* dan *atoms* yang membentuk bagian kompleks/seksi UI. | `HeaderTransaksi`, `FormLogin` |
| **Templates** | Tata letak halaman (screen) tanpa data nyata. | `HomeScreenTemplate` |
| **Pages** | *Templates* yang diisi dengan data nyata dari *ViewModel*. | `HomeScreen`, `LaporanScreen` |

### 3. Arsitektur Clean (MVVM)

Aplikasi mengikuti pola **Model-View-ViewModel (MVVM)** dengan menggunakan *Flow* dan *Coroutines* untuk manajemen data asinkron, memastikan pemisahan tanggung jawab yang jelas:

* **Data Layer:** Menangani sumber data (database lokal/API).
* **Domain Layer:** Berisi *Use Cases* atau logika bisnis.
* **Presentation Layer:** Berisi *Composables* (View) dan *ViewModels*.

## ⚙️ Persyaratan Sistem

* **Android Studio:** Versi terbaru (Disarankan: Jellyfish atau yang lebih baru).
* **SDK:** Android API Level 24 (Android 7.0 - Nougat) atau lebih tinggi.
* **Kotlin:** Versi 1.9+

## 🚀 Cara Menjalankan Secara Lokal

Untuk mengkloning dan menjalankan proyek ini di mesin Anda:

1.  **Kloning Repositori:**
    ```bash
    git clone [https://github.com/ekonrfy/pos_umkm.git](https://github.com/ekonrfy/pos_umkm.git)
    cd pos_umkm
    ```

2.  **Buka di Android Studio:**
    * Buka Android Studio.
    * Pilih **File** -> **Open** dan arahkan ke direktori `pos_umkm`.

3.  **Sinkronisasi Proyek:**
    * Tunggu hingga Gradle selesai men-*sync* proyek.

4.  **Jalankan Aplikasi:**
    * Pilih emulator atau perangkat Android.
    * Klik tombol **Run** (ikon segitiga hijau).

## 🤝 Kontribusi

Kami menerima kontribusi dari siapa pun! Jika Anda menemukan *bug* atau memiliki ide fitur, silakan:

1.  *Fork* repositori ini.
2.  Buat *branch* fitur Anda (`git checkout -b fitur/NamaFitur`).
3.  *Commit* perubahan Anda (`git commit -m 'Tambahkan: Deskripsi fitur'`).
4.  *Push* ke *branch* (`git push origin fitur/NamaFitur`).
5.  Buat **Pull Request** ke *branch* `main`.

## 📄 Lisensi

Proyek ini dilisensikan di bawah Lisensi MIT. Lihat file [LICENSE](LICENSE) untuk detail lebih lanjut.

---
