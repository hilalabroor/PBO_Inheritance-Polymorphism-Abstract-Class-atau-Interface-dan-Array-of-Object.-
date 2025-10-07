# PBO_Inheritance-Polymorphism-Abstract-Class-atau-Interface-dan-Array-of-Object

## Identitas
- Nama: M. Wahyu Hilal Abroor
- NIM: F1D02310123
- Tugas: Inheritance, Polymorphism, Abstract Class/Interface, dan Array of Object

## Deskripsi Program
Program ini adalah program yang mensimulasikan sistem rumah pintar dengan beberapa perangkat seperti Lampu, AC, dan CCTV. Setiap perangkat merupakan turunan dari kelas abstrak `SmartDevice` dan dapat memiliki fitur otomatis melalui interface `Kontrol`. Program mendemonstrasikan konsep inheritance, polymorphism, abstract class, interface, dan penggunaan array of object.

## Struktur Kelas
- **SmartDevice (abstract class):** Kelas dasar untuk semua perangkat, berisi atribut nama dan status, serta method dasar.
- **Kontrol (interface):** Interface untuk fitur otomatis perangkat.
- **Lampu, AC, CCTV (class):** Turunan dari SmartDevice dan mengimplementasikan Kontrol, masing-masing dengan fitur khusus.
- **Main (class):** Berisi method `main` untuk menjalankan simulasi dan mendemonstrasikan fitur perangkat.

```
Kontrol (interface)
SmartDevice (abstract)
├── Lampu (implements Kontrol)
├── AC (implements Kontrol)
└── CCTV (implements Kontrol)
Main
```

## Penjelasan Kode
- **SmartDevice:**
  
<img width="709" height="546" alt="image" src="https://github.com/user-attachments/assets/19f18dc5-65ac-4c9c-9210-570e5cb0e17d" />

Kelas ini memiliki atribut namaPerangkat dan status untuk menyimpan nama serta kondisi perangkat (hidup atau mati). Konstruktor digunakan untuk memberi nama perangkat dan mengatur status awal ke false (mati). Terdapat dua metode konkret, hidupkan() dan matikan(), untuk mengubah status perangkat sekaligus menampilkan pesan ke layar, serta satu metode abstrak tampilkanStatus() yang wajib diimplementasikan oleh subclass agar masing-masing perangkat bisa menampilkan statusnya dengan cara berbeda.

- **Kontrol:**
  
<img width="433" height="180" alt="image" src="https://github.com/user-attachments/assets/edbc639c-9465-4bdc-8b88-e978a683a3ad" />

  Interface dengan method `aktifkanOtomatis` dan `nonaktifkanOtomatis` untuk fitur otomatis perangkat.
  
- **Lampu:**
  
  <img width="1453" height="719" alt="image" src="https://github.com/user-attachments/assets/ab287842-be2c-4f3e-aeda-bba94f170644" />
  
Kelas ini merupakan turunan dari SmartDevice dan mengimplementasikan interface Kontrol. Kelas ini memiliki atribut tingkatKecerahan untuk menyimpan seberapa terang lampu. Konstruktor digunakan untuk memberi nama perangkat melalui kelas induk dan mengatur tingkat kecerahan awal ke 50%. Metode aturKecerahan() digunakan untuk mengubah tingkat kecerahan lampu, sedangkan tampilkanStatus() menampilkan kondisi lampu apakah sedang menyala atau mati beserta tingkat kecerahannya. Selain itu, terdapat dua metode dari interface Kontrol, yaitu aktifkanOtomatis() dan nonaktifkanOtomatis(), yang mengatur fitur otomatis lampu.
  
- **AC:**
  
<img width="1292" height="737" alt="image" src="https://github.com/user-attachments/assets/5ce6afe6-9e7d-4dad-95d1-eee64876f5a1" />

Kelas ini merupakan turunan dari SmartDevice dan mengimplementasikan interface Kontrol. Kelas ini memiliki atribut suhu untuk menyimpan suhu yang diatur pada AC. Konstruktor digunakan untuk memberi nama perangkat melalui kelas induk dan menetapkan suhu awal sebesar 24°C. Metode aturSuhu() digunakan untuk mengubah suhu AC sesuai kebutuhan, sedangkan tampilkanStatus() menampilkan kondisi AC apakah menyala atau mati beserta suhu yang sedang digunakan. Dua metode dari interface Kontrol, yaitu aktifkanOtomatis() dan nonaktifkanOtomatis(), digunakan untuk mengatur fitur otomatis AC, seperti menyalakan atau mematikan perangkat berdasarkan suhu ruangan.

- **CCTV:**
  
<img width="1531" height="828" alt="image" src="https://github.com/user-attachments/assets/5800ef8e-ca40-49d6-bd46-869d5a2a1d29" />

Kelas ini merupakan turunan dari SmartDevice dan mengimplementasikan interface Kontrol. Kelas ini memiliki atribut modeRekam untuk menyimpan status apakah CCTV sedang merekam atau tidak. Konstruktor digunakan untuk memberi nama perangkat melalui kelas induk dan mengatur mode rekam awal ke false (tidak merekam). Metode mulaiRekam() berfungsi untuk memulai perekaman jika CCTV dalam keadaan menyala, sedangkan tampilkanStatus() menampilkan kondisi perangkat, apakah sedang menyala dan merekam atau tidak. Dua metode dari interface Kontrol, yaitu aktifkanOtomatis() dan nonaktifkanOtomatis(), digunakan untuk mengatur fitur otomatis CCTV seperti menyalakan perangkat saat mendeteksi gerakan dan mematikannya saat tidak diperlukan.
  
- **Main:**
  
  <img width="773" height="798" alt="image" src="https://github.com/user-attachments/assets/7be1e3d9-c37d-45b3-8461-f17ef9f6abc1" />
  
Kelas Main berfungsi sebagai program utama untuk menjalankan sistem rumah pintar Smartify. Di dalamnya dibuat tiga objek perangkat pintar yaitu Lampu, AC, dan CCTV yang disimpan dalam array perangkat.

## Kesimpulan
Program ini berhasil menerapkan konsep inheritance, polymorphism, abstract class, interface, dan array of object dalam simulasi sistem rumah pintar. Melalui konsep pewarisan (inheritance), setiap perangkat seperti Lampu, AC, dan CCTV dapat mewarisi sifat dasar dari kelas induk SmartDevice. Dengan adanya abstract class dan interface, setiap perangkat juga bisa memiliki fitur otomatis dan cara kerja yang berbeda sesuai jenisnya. Selain itu, penggunaan array of object memungkinkan semua perangkat diakses secara seragam menggunakan tipe induk, sehingga program menjadi lebih rapi, mudah dikembangkan, dan efisien dalam pengelolaan berbagai perangkat pintar.
