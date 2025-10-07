---

<h1 align="center">📝 My Notes</h1>

<p align="center">
  <b>Aplikasi Catatan berbasis Android dengan fitur login dan hapus catatan</b><br>
  📱 Dibuat menggunakan <b>Java</b> dan <b>Android Studio</b> — sederhana namun fungsional.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge" alt="Java Badge">
  <img src="https://img.shields.io/badge/Platform-Android-green?style=for-the-badge" alt="Android Badge">
  <img src="https://img.shields.io/badge/Status-Completed-blue?style=for-the-badge" alt="Status Badge">
</p>

---

## ✨ Fitur Aplikasi

✅ Login sederhana menggunakan username  
✅ Navigasi antar halaman menggunakan **Intent**  
✅ Menampilkan username di setiap halaman (Home, Notes, Profile)  
✅ Membuat dan menghapus catatan secara dinamis  
✅ Desain layout simpel dan mudah digunakan  
✅ Logout kembali ke halaman utama  

---

## 📲 Tampilan Antarmuka (UI)

|                          Halaman Login                          |                         Halaman Home                        |                         Halaman Notes                         |                          Halaman Profile                          |
| :-------------------------------------------------------------: | :---------------------------------------------------------: | :-----------------------------------------------------------: | :---------------------------------------------------------------: |
| ![Login](https://via.placeholder.com/200x400?text=Login+Screen) | ![Home](https://via.placeholder.com/200x400?text=Home+Page) | ![Notes](https://via.placeholder.com/200x400?text=Notes+Page) | ![Profile](https://via.placeholder.com/200x400?text=Profile+Page) |

---

## ⚙️ Struktur Proyek
My-Notes/
├── app/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/com/mynotes/
│ │ │ │ ├── MainActivity.java
│ │ │ │ ├── HomePage.java
│ │ │ │ ├── NotePages.java
│ │ │ │ └── Profile.java
│ │ │ └── res/ (layout, drawable, values)
│ └── build.gradle
├── .gitignore
└── README.md


---

## 🚀 Cara Menjalankan Aplikasi

1. Clone repository ini:

   ```bash
   git clone https://github.com/USERNAME/My-Notes.git
2. Buka di Android Studio = File → Open → pilih folder My-Notes
3. Jalankan di emulator atau perangkat Android nyata

🧠 Konsep yang Dipelajari
| Konsep                           | Penjelasan                                                |
| :------------------------------- | :-------------------------------------------------------- |
| **Intent & putExtra()**          | Mengirim data (username) antar Activity                   |
| **getIntent().getStringExtra()** | Menerima data dari Activity lain                          |
| **Dynamic View**                 | Menambah dan menghapus catatan langsung dari kode Java    |
| **Event Handling (onClick)**     | Menangani tombol login, tambah catatan, dan hapus catatan |
| **Activity Navigation**          | Perpindahan halaman antar Activity dengan Intent          |

👨‍💻 Tentang Proyek

📘 Nama Proyek: My Notes
🏫 Tujuan: Tugas Sekolah — Tugas Ujian Tengah Semester
🧩 Bahasa: Java
🧰 IDE: Android Studio
📅 Tahun: 2025

👥 Tim Pengembang:
Bayu Adi Setyawan
Daniswara Nayaka Indrastata
Hanung Satya Adi Wicaksono
Pracanda Arga Sava Nayottama

💬 Lisensi

Proyek ini dibuat untuk keperluan pembelajaran.
Silakan gunakan atau modifikasi untuk keperluan edukasi.

<p align="center"> Made with ❤️ by <a href="https://github.com/bayydstywn-dev">Bayu Adi Setyawan</a> & Team </p>
