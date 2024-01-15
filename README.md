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

## Menjalankan Aplikasi

Pastikan skenario yang dibuat sudah benar. Pastikan juga skrip pada file stepDef sesuai dengan skenario yang dibuat di folder feature. Setelah itu, jalankan proyek di folder runner.
