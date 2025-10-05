Perfect — isi README-nya udah keren banget, cuma ada **dua masalah kecil** yang bikin tampilannya di GitHub belum rapi:

1. Ada **blok kode yang belum ditutup dengan benar** (` ```` ` muncul dua kali di tengah).
2. Struktur folder sebaiknya dibungkus pakai satu blok kode ` ``` ` biar formatnya tetap rapi tapi tidak "rusak" ke bagian bawah.

---

Berikut versi yang **sudah diperbaiki dan siap langsung kamu paste ke GitHub** (tidak perlu tambahan tanda apa pun di atas atau bawahnya):

---

<h1 align="center">📝 My Notes</h1>

<p align="center">
  <b>Simple Android Notes App built with Java & Android Studio</b><br>
  📱 A lightweight app to create, view, and delete notes — with username passing across multiple activities.
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
✅ Membuat dan menghapus catatan dengan tampilan dinamis
✅ Desain layout simpel dan mudah dipahami
✅ Logout kembali ke halaman utama

---

## 📲 Tampilan Antarmuka (UI)

> Tambahkan screenshot aplikasi kamu di sini biar makin keren 😄

|                          Halaman Login                          |                         Halaman Home                        |                         Halaman Notes                         |                          Halaman Profile                          |
| :-------------------------------------------------------------: | :---------------------------------------------------------: | :-----------------------------------------------------------: | :---------------------------------------------------------------: |
| ![Login](https://via.placeholder.com/200x400?text=Login+Screen) | ![Home](https://via.placeholder.com/200x400?text=Home+Page) | ![Notes](https://via.placeholder.com/200x400?text=Notes+Page) | ![Profile](https://via.placeholder.com/200x400?text=Profile+Page) |

---

## ⚙️ Struktur Proyek

```
My-Notes/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/hann/mynotes_android/
│   │   │   │   ├── MainActivity.java
│   │   │   │   ├── HomePage.java
│   │   │   │   ├── NotePages.java
│   │   │   │   └── Profile.java
│   │   │   └── res/ (layout, drawable, values)
│   └── build.gradle
├── .gitignore
└── README.md
```

---

## 🚀 Cara Menjalankan Aplikasi

1. Clone repository ini:

   ```bash
   git clone https://github.com/Hanung-Satya/My-Notes.git
   ```

2. Buka di Android Studio
   `File → Open → pilih folder My-Notes`

3. Jalankan di **emulator** atau **perangkat Android nyata**

---

## 🧠 Konsep yang Dipelajari

| Konsep                           | Penjelasan                                                |
| :------------------------------- | :-------------------------------------------------------- |
| **Intent & putExtra()**          | Mengirim data (username) antar Activity                   |
| **getIntent().getStringExtra()** | Menerima data dari Activity lain                          |
| **Dynamic View**                 | Menambah dan menghapus catatan langsung dari kode Java    |
| **Event Handling (onClick)**     | Menangani tombol login, tambah catatan, dan hapus catatan |
| **Activity Navigation**          | Perpindahan halaman antar Activity dengan Intent          |

---

## 🔮 Pengembangan Selanjutnya

💡 Menyimpan catatan menggunakan **SQLite / Room Database**
💡 Menambahkan fitur **Edit Note**
💡 Menambahkan autentikasi dengan password
💡 Menambahkan tampilan tema gelap (Dark Mode)

---

## 👨‍💻 Tentang Proyek

📘 **Nama Proyek:** My Notes
🏫 **Tujuan:** Tugas kuliah — pembelajaran konsep Intent & Activity
🧩 **Bahasa:** Java
🧰 **IDE:** Android Studio
📅 **Tahun:** 2025

---

## 💬 Lisensi

Proyek ini dibuat untuk keperluan pembelajaran.
Silakan gunakan atau modifikasi untuk keperluan edukasi.

---

<p align="center">
  Made with ❤️ by <a href="https://github.com/Hanung-Satya">Hanung Satya</a>
</p>

---
