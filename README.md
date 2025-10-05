# 💻 Belajar OOP dengan Java

Project ini dibuat sebagai latihan memahami konsep **Object-Oriented Programming (OOP)** menggunakan bahasa **Java**.  
Seluruh kode ditulis dan dijalankan menggunakan **Visual Studio Code (VS Code)**.

---

## 📚 Tujuan Pembelajaran
- Memahami dasar-dasar **Class** dan **Object**
- Menggunakan **Constructor**, **Method**, dan **Encapsulation**
- Menerapkan logika program seperti `if`, `else`, `loop`, dan `switch`
- Membuat simulasi sederhana seperti **Akun Bank** dan **Mahasiswa**

---

## 🏗️ Struktur Proyek
```
Belajar_java/
│
├── belajaroop/
│   ├── Mahasiswa.java
│   └── AkunBank.java
│
└── README.md
```

---

## 🚀 Fitur yang Sudah Dibuat

### 1️⃣ `Mahasiswa.java`
- Menyimpan data nama, NIM, IPK, dan semester.
- Menampilkan informasi mahasiswa.
- Mengecek perubahan IPK.
- Menampilkan status kenaikan semester.

#### 🧩 Contoh Output:
```
Nama: Asep
NIM: 25123
IPK: 3.3
Semester: 3
IPK naik dari 3.2 menjadi 3.3
Mahasiswa naik ke semester berikutnya!
```

---

### 2️⃣ `AkunBank.java`
- **Encapsulation**: Variabel `saldo` dan `namaPemilik` bersifat private.
- **Getter & Setter**: Mengatur dan mengambil data saldo dengan aman.
- **Method**:
  - `setor()`: Menambah saldo.
  - `tarik()`: Mengurangi saldo (dengan validasi).
  - `transfer()`: Mengirim saldo antar akun bank.

#### 🧩 Contoh Output:
```
Nama pemilik: Asep
Saldo Awal: 500000

Berhasil setor ke Asep sejumlah 300000
Berhasil tarik dari Asep sebesar 500000
Transfer berhasil sebesar 200000 ke Ujang
Ujang menerima transfer sebesar 200000 dari Asep

Saldo Asep sekarang: 100000
Saldo Ujang sekarang: 700000
```

---

## 🧠 Konsep OOP yang Dipraktikkan

| Konsep OOP | Penjelasan | Implementasi |
|-------------|-------------|---------------|
| **Class** | Cetak biru dari objek | `class Mahasiswa`, `class AkunBank` |
| **Object** | Instance dari class | `Mahasiswa mhs1 = new Mahasiswa(...);` |
| **Encapsulation** | Menyembunyikan data dengan `private` | Variabel `saldo`, `namaPemilik` |
| **Method** | Fungsi dalam class | `setor()`, `tarik()`, `transfer()` |
| **Constructor** | Inisialisasi objek | `public Mahasiswa(...) { ... }` |
| **Abstraction (dasar)** | Menyederhanakan proses dengan method | Transfer, penarikan, dsb. |

---

## ⚙️ Cara Menjalankan

1. Pastikan **Java SDK (JDK)** sudah terinstal dan PATH sudah dikonfigurasi.
   ```bash
   java -version
   javac -version
   ```
2. Buka proyek di **Visual Studio Code**.
3. Jalankan file menggunakan salah satu cara:
   - Klik kanan file → **Run Java**
   - Atau melalui terminal:
     ```bash
     javac belajaroop/AkunBank.java
     java belajaroop.AkunBank
     ```
4. Lihat output di terminal.

---

## 🧩 Rencana Pengembangan (Next Step)
- [ ] Menambahkan class `Bank` untuk menyimpan daftar akun.
- [ ] Menambahkan menu interaktif menggunakan `Scanner`.
- [ ] Menyimpan riwayat transaksi (mutasi) menggunakan `ArrayList`.
- [ ] Menambahkan validasi tambahan & tampilan lebih rapi.

---

## 👨‍💻 Pembuat
**Nama:** Asep (contoh)  
**Tujuan:** Latihan Pemrograman Berorientasi Objek (OOP)  
**Editor:** Visual Studio Code  
**Bahasa:** Java  

---

## 🏷️ License
Proyek ini dibuat untuk tujuan pembelajaran.  
Kamu bebas menggunakannya, memodifikasi, atau mengembangkan lebih lanjut.

---
