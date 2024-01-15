# Konfigurasi Gherkin Syntax dengan Cucumber di IntelliJ

## Langkah-langkah Instalasi

1. Pastikan Anda telah menginstal Java (Saya menggunakan versi Java 17).
2. Instal IntelliJ IDEA.
3. Setelah menginstal kedua alat tersebut, buka IntelliJ IDEA.
4. Buat proyek baru dengan memilih arketipe Maven.
5. Masukkan nama proyek, pilih lokasi penyimpanan proyek, pilih versi JDK (Saya menggunakan versi 17).
6. Pilih jenis arketipe (Saya menggunakan maven archetype.archetype) dan klik tombol "create".
7. Instal dependensi yang diperlukan seperti Selenium, JUnit, WebDriver, dan Cucumber (seperti yang tercantum dalam file pom.xml). Setelah memasukkan dependensi, jangan lupa untuk:
   - Klik tombol Maven untuk menginstal dependensi yang dipilih.
8. Buat folder bernama "features" dan buatlah file di dalamnya (contoh: login.feature). File ini digunakan untuk menulis skenario untuk proses pengujian.
9. Buat folder bernama "runners" dan buat satu file dengan judul yang Anda pilih. Impor file Cucumber dan jalankan dengan file tersebut. File ini bertanggung jawab untuk menjalankan skenario yang sudah dikerjakan.
10. Buat folder bernama "stepDef" dan buat file yang berisi beberapa fungsi dengan skrip untuk menjalankan proses pengujian.
11. Setelah selesai membuat folder, simpan file (Ctrl+S), dan kemudian bangun ulang proyek (Build -> Rebuild Project). Setelah dibangun ulang, proyek dapat dijalankan.

## Test Case

Pastikan skenario yang dibuat sudah benar. Pastikan juga skrip pada file stepDef sesuai dengan skenario yang dibuat di folder feature. Setelah itu, jalankan proyek di folder runner.

| Module | Test case ID | Text case description | Expected result | Actual result | Status |                      |
|----:|-------------------------------------|
|  Login  | U_001 | Input username dan password yang valid | User berhasil login | User sukses login | Pass |
|  Login  - email| U_002 | Input email tanpa @ | User gagal login email yang diinputkan tidak valid | menampilkan info eror pada kolom | Pass |
|  Login - email | U_003 |  Input email tanpa domain (.com) | User gagal login email yang diinputkan tidak valid | menampilkan info eror pada kolom | Pass |
|  Login - password | U_004 | Input password invalid | Menampilkan informasi error bahwa password yang dimasukkan tidak sesuai dengan email/username yang diinputkan | Informasi eror tampil pada display | Pass | 
|  Login - username  | U_005 | Input username invalid | User gagal login, username belum terdaftar | Info eror akan di tampilkan di diplay user harus menginputkan username yang valid | Pass |


## Menjalankan Aplikasi

Pastikan skenario yang dibuat sudah benar. Pastikan juga skrip pada file stepDef sesuai dengan skenario yang dibuat di folder feature. Setelah itu, jalankan proyek di folder runner.
