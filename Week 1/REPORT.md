|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020212|
| Nama |  Naufal Abid Aurizky |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Abidau/Algoritma-Struktur-Data/tree/main/Week%201) |

# KONSEP DASAR PEMROGRAMAN

## 2.2.1 Praktikum Pemilihan

Hasil Kode Program Pada Percobaan Pemilihan

![Screenshot](img/Pemilihan.png)

Langkah-Langkah Kode Pemograman saya :
1. Menginput Nilai Tugas, Kuis, UTS, UAS
2. Kode akan selesai jika nilai lebih dari 100 
3. Jika Nilai tidak ada yang lebih dari 100, kode akan memilih Jika Nilai Huruf yang didapatkan adalah A, B+, B, C+, C maka LULUS, jika nilai huruf D dan E maka TIDAK LULUS.

## 2.3.1 Praktikum Perulangan

Hasil Kode Program Pada Percobaan Perulangan

![Screenshot](img/Perulangan.png)

Langkah-Langkah Kode Pemograman saya :
1. program meminta memasukkan NIM sebagai String
2. Dua digit diambil dan dikonversi ke int, dan Program mencetak nilai akhir n
3. Program akan melakukan perulangan dari 1 hingga n, jika (i == 6) atau (i == 10), iterasi dilewati (continue)
4. Angka genap dicetak, sedangkan angka ganjil akan mencetak '*'

## 2.4.1 Praktikum Array

Hasil Kode Program Pada Percobaan Array

![Screenshot](img/Array.png)

Langkah-Langkah Kode Pemograman saya :
1. Program mendeklarasikan beberapa array untuk menyimpan informasi mata kuliah :

- namaMk → Nama mata kuliah
- sks → Jumlah SKS tiap mata kuliah
- angkaMk → Menyimpan nilai angka yang dimasukkan pengguna
- hurufMk → Menyimpan nilai huruf hasil konversi dari nilai angka
- bobotMk → Menyimpan bobot nilai berdasarkan nilai huruf
- totalBObotSKS dan totalSKS → Variabel untuk menghitung IP semester

2. Program akan meminta memasukkan nilai angka untuk setiap mata kuliah dan nilai angka akan disimpan dalam array angkaMk
3. Setelah menerima nilai angka, program mengonversinya menjadi 

- NIlai Huruf (A, B+, B, C+, C, D, E) berdasarkan rentang nilai
- Bobot nilai sesuai dengan standar akademik

4. Bobot nilai dikalikan dengan jumlah SKS, lalu ditambahkan ke totalBobotSKS dan jumlah SKS juga dihitung dalam totalSKS
5. Program akan menampikan hasil konversi dalam format tabel dengan kolom

## 2.5.1 Praktikum Fungsi

Hasil Kode Program Pada Percobaan Fungsi

![Screenshot](img/Fungsi.png)

Langkah-Langkah Kode Pemograman saya :
1. Kode program PraktikumFungsi digunakan untuk menghitung pendapatan dari penjualan bunga di beberapa cabang toko serta menampilkan stok bunga di cabang Royal Garden 4 setelah dilakukan pengurangan.
2. Program dimulai dengan mendeklarasikan array bunga yang berisi nama bunga, array harga yang menyimpan harga masing-masing bunga, array cabang yang menyimpan daftar cabang toko, serta array dua dimensi stok yang merepresentasikan jumlah stok setiap bunga di masing-masing cabang.
3. Dalam metode main, program memanggil dua fungsi, yaitu tampilPendapatan dan tampilStokBunga. Fungsi tampilPendapatan menghitung total pendapatan setiap cabang dengan mengalikan stok bunga di cabang tersebut dengan harga masing-masing bunga, lalu menjumlahkan totalnya. Hasil pendapatan untuk setiap cabang kemudian ditampilkan di layar.
4. Fungsi tampilStokBunga digunakan untuk menampilkan stok bunga di Royal Garden 4 setelah dikurangi dengan jumlah tertentu sesuai dengan array pengurang. Setelah pengurangan dilakukan, stok bunga yang tersisa ditampilkan ke layar.

## Tugas 
### Tugas 1

Hasil Kode Program Pada Tugas Nomer 1

![Screenshot](img/Tugas1.png)

Langkah-Langkah Kode Pemograman saya :
1. Program mendeklarasikan array KODE yang berisi karakter kode plat nomor dan array KOTA yang menyimpan nama kota dalam bentuk array karakter dua dimensi.
2. Program meminta pengguna untuk memasukkan satu karakter kode plat nomor menggunakan Scanner, lalu membaca karakter pertama dari input yang diberikan. Setelah itu, Scanner ditutup untuk menghemat sumber daya.
3. Program melakukan pencarian kode plat nomor dalam array KODE menggunakan perulangan for. Jika ditemukan, program menampilkan nama kota yang sesuai dengan cara mengakses elemen array KOTA pada indeks yang sama.
4. Program mencetak karakter dalam array KOTA satu per satu untuk membentuk nama kota yang lengkap, kemudian menampilkan hasilnya di layar. Jika kode ditemukan, pencarian dihentikan menggunakan break.
5. Jika kode yang dimasukkan tidak ada dalam array KODE, program menampilkan pesan "Kode plat tidak ditemukan", menandakan bahwa input pengguna tidak cocok dengan daftar kode yang tersedia.

### Tugas 2

Hasil Kode Program Pada Tugas Nomer 2

![Screenshot](img/Tugas2.png)

Langkah-Langkah Kode Pemograman saya :
1. Program menampilkan menu pilihan kepada pengguna dengan empat opsi:

- Menghitung Volume Kubus
- Menghitung Luas Permukaan Kubus
- Menghitung Keliling Kubus
- Keluar dari program

2. Pengguna diminta memasukkan angka sesuai dengan pilihan perhitungan yang diinginkan. Jika pengguna memilih opsi 4 (Keluar), program akan menampilkan pesan "Program selesai." dan keluar dari perulangan dengan break.

3. Jika pengguna memilih opsi selain 4, program meminta pengguna untuk memasukkan panjang rusuk kubus dalam bentuk angka desimal (double). Program kemudian menggunakan switch-case untuk memanggil fungsi yang sesuai dengan pilihan pengguna:

- hitungVolume(double rusuk) → Mengembalikan volume kubus dengan rumus rusuk³
- hitungLuasPermukaan(double rusuk) → Mengembalikan luas permukaan kubus dengan rumus 6 × rusuk²
- hitungKeliling(double rusuk) → Mengembalikan keliling kubus dengan rumus 12 × rusuk

4. Program terus menampilkan menu dan meminta input hingga pengguna memilih opsi 4. Jika pengguna memasukkan angka selain 1, 2, atau 3, program akan menampilkan "Pilihan tidak valid". Setelah program selesai, Scanner ditutup untuk mencegah kebocoran sumber daya.

### Tugas 3

Hasil Kode Program Pada Tugas Nomer 3

![Screenshot](img/Tugas31.png)

![Screenshot](img/Tugas32.png)

![Screenshot](img/Tugas33.png)

Langkah-Langkah Kode Pemograman saya :
1. Program meminta pengguna untuk memasukkan jumlah mata kuliah yang akan dimasukkan. Untuk setiap mata kuliah, pengguna diminta mengisi nama mata kuliah, jumlah SKS, semester, dan hari kuliah. Data ini disimpan dalam array namaMk, sks, semester, dan hari.
2. Program menampilkan menu berisi lima pilihan:

- 1 : Menampilkan seluruh jadwal kuliah.
- 2 : Menampilkan jadwal berdasarkan hari tertentu.
- 3 : Menampilkan jadwal berdasarkan semester tertentu.
- 4 : Mencari mata kuliah berdasarkan namanya.
- 5 : Keluar dari program.

    Pengguna diminta memasukkan angka sesuai dengan pilihan yang diinginkan.

3. Berdasarkan input pengguna, program memanggil salah satu dari empat fungsi berikut:

- tampilkanJadwal() → Menampilkan seluruh daftar mata kuliah beserta informasi SKS, semester, dan hari kuliah.
- tampilkanJadwalHari() → Menampilkan daftar mata kuliah yang dijadwalkan pada hari tertentu.
- tampilkanJadwalSemester() → Menampilkan daftar mata kuliah yang tersedia pada semester tertentu.
- cariMataKuliah() → Mencari dan menampilkan informasi mata kuliah berdasarkan nama yang dimasukkan pengguna.

4. Jika pengguna memilih untuk menampilkan jadwal berdasarkan hari, semester, atau mencari mata kuliah berdasarkan nama, program akan memeriksa apakah data yang dicari tersedia. Jika tidak ditemukan, program menampilkan pesan "Mata kuliah tidak ditemukan".

5. Program terus menampilkan menu hingga pengguna memilih opsi 5 (Keluar). Jika opsi ini dipilih, program menampilkan pesan "Program selesai." dan keluar dari perulangan menggunakan 'return'