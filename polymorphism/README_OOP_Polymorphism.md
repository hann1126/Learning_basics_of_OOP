# Latihan OOP Java — Polymorphism & Method Overriding

Latihan ini dibuat untuk memahami konsep dasar Polymorphism dalam OOP menggunakan bahasa pemrograman Java.

## 🎯 Tujuan Pembelajaran
- Memahami konsep **inheritance**
- Menerapkan **polymorphism**
- Melakukan **method overriding**
- Menggunakan constructor dengan `super()`
- Mengelola **array of objects**

## 📌 Struktur Kelas
| Class | Peran |
|------|------|
| `Karyawan` | Parent class dengan atribut dan method dasar |
| `Manager` | Child class, memiliki atribut bonus |
| `Programmer` | Child class, memiliki atribut lembur |
| `Main` | Class untuk menjalankan program dan pembuktian polymorphism |

## 🧩 Hasil Akhir yang Diharapkan
- Program dapat membuat objek `Manager` dan `Programmer`
- Kedua objek disimpan dalam array bertipe `Karyawan`
- Setiap objek memanggil method `info()` yang dioverride sesuai jenisnya

## ✅ Contoh Output
```
Asep sebagai Manager, Gaji: 2000000 + Bonus: 500000
Andi sebagai Programmer, Gaji: 1500000 + Lembur: 300000
```

## 🚀 Konsep Penting
### Apa itu Polymorphism?
Polymorphism memungkinkan objek yang berbeda memberikan **implementasi berbeda** pada method yang sama.

```java
for (Karyawan k : daftar) {
    k.info(); // method yang dipanggil tergantung tipe objek sebenarnya
}
```

### Apa itu Method Overriding?
Adalah mengganti implementasi method parent pada child class.  
Diberi anotasi:
```java
@Override
```

---
📌 Latihan ini merupakan lanjutan dari materi OOP sebelumnya dan menjadi dasar yang kuat untuk memahami:
- Abstraction
- Interfaces
- Polymorphism tingkat lanjut
