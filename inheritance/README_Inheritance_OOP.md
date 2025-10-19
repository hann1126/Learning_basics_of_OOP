
# 🧬 Latihan OOP Java – Inheritance (Pewarisan)

Proyek ini merupakan latihan lanjutan dari materi **Object-Oriented Programming (OOP)** di Java dengan fokus pada konsep **Inheritance (pewarisan)**.  
Kita membuat hierarki class dari `Hewan` sebagai class induk dan beberapa class turunan seperti `Mamalia`, `Burung`, `Kucing`, `Anjing`, dan `Elang`.

---

## 📁 Struktur Project

```
belajaroop/inheritance/
│
├── Hewan.java
├── Mamalia.java
├── Burung.java
├── Kucing.java
├── Anjing.java
├── Elang.java
└── DemoHewan.java
```

---

## ⚙️ Konsep yang Dipelajari

- **Inheritance (Pewarisan)** → Class turunan mewarisi atribut dan method dari class induk.  
- **Constructor chaining** → Penggunaan `super()` untuk memanggil constructor class induk.  
- **Polymorphism sederhana** → Override method `bergerak()` untuk menampilkan perilaku berbeda pada tiap class turunan.  
- **Encapsulation ringan** → Penggunaan atribut dan akses melalui method di class yang tepat.

---

## 🧠 Penjelasan Singkat

| Class | Deskripsi |
|-------|------------|
| `Hewan` | Class induk yang memiliki atribut `nama` serta method umum seperti `makan()` dan `bergerak()` |
| `Mamalia` | Turunan `Hewan` yang menambahkan atribut `jumlahKaki` dan method `info()` |
| `Burung` | Turunan `Hewan` yang menambahkan method `terbang()` |
| `Kucing` | Turunan `Mamalia` dengan method khusus `meong()` dan override `bergerak()` |
| `Anjing` | Turunan `Mamalia` dengan method `menggonggong()` dan override `bergerak()` |
| `Elang` | Turunan `Burung` dengan method tambahan `berburu()` |

---

## 🚀 Cara Menjalankan

1. Buka project di **NetBeans**, **IntelliJ**, atau **VS Code dengan plugin Java**.
2. Jalankan file `DemoHewan.java`.
3. Amati hasil keluaran di console.

---

## 🧩 Output Contoh

```
Milo adalah mamalia dengan 4 kaki.
Milo sedang makan...
Milo berjalan dengan anggun di atas empat kaki.
Milo mengeong: Meooong!
----------------
Buddy adalah mamalia dengan 4 kaki.
Buddy sedang makan...
Buddy berlari dengan cepat mengejar bola!
Buddy menggonggong: Guk guk!
----------------
Garuda sedang makan...
Garuda melayang di udara dengan sayapnya.
Garuda terbang tinggi di langit!
Garuda menyambar mangsanya dengan cepat!
```

---

## 💬 Catatan
Latihan ini bertujuan untuk memperkuat pemahaman konsep pewarisan dan polimorfisme dasar dalam Java.  
Kamu bisa mengembangkan contoh ini dengan menambahkan class turunan baru atau menambahkan logika perilaku yang lebih kompleks.

---

### ✨ Dibuat oleh:
**namasaya** – Latihan OOP Java 2025
