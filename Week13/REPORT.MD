|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020212|
| Nama |  Naufal Abid Aurizky |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Abidau/Algoritma-Struktur-Data/tree/main/Week13) |

# Tree


## 14.2 Kegiatan Praktikum 1

Hasil Kode Program 

![Screenshot](img/P1.png)

![Screenshot](img/P2.png)

![Screenshot](img/P3.png)

### 14.2.2 Pertanyaan Percobaan

1. Karena BST terurut berdasarkan nilai, pencarian bisa langsung memilih cabang kiri atau kanan, seperti pada binary search.

2. Untuk menyimpan referensi ke anak kiri dan kanan dari node, membentuk struktur pohon.

3. A) Sebagai titik awal (akar) untuk seluruh operasi pada tree (penelusuran, penambahan, dll).
   B) null, karena tree masih kosong.

4. Node baru akan menjadi root.

5. Untuk menentukan apakah node baru akan ditempatkan di kiri atau kanan sesuai aturan BST (kiri <, kanan ≥).

6. Saat hapus node dengan 2 anak, maka method delete() akan memanggil getSuccessor() untuk mencari node pengganti yang nilainya paling dekat dengan node yang dihapus. Node pengganti ini akan menggantikan node yang dihapus dalam struktur tree. GetSuccessor() akan mencari node yang nilainya paling dekat dengan node yang dihapus dengan cara mencari node yang paling kiri di sub-tree kanan dari node yang dihapus. Setelah itu, method delete() akan menghubungkan node pengganti dengan parent dari node yang dihapus dan mengupdate child dari parent sesuai dengan posisi node yang dihapus.

## 14.3 Kegiatan Praktikum 2

Hasil Kode Program 

![Screenshot](img/P4.png)

### 14.3.2 Pertanyaan Percobaan

1. data untuk Menyimpan elemen-elemen tree dalam bentuk array. idxLast untuk Menunjukkan indeks data terakhir yang terisi.

2. Untuk mengisi data tree ke dalam array sebelum dilakukan traversal atau operasi lainnya.

3. Untuk menampilkan isi tree secara in-order (kiri, akar, kanan).

4. Anak kiri = 2 * 2 + 1 = 5 / Anak kanan = 2 * 2 + 2 = 6

5. Untuk menandai batas data terakhir yang dimasukkan ke array (pada indeks ke-6).

6. Karena itu adalah rumus posisi anak kiri dan kanan dalam representasi tree menggunakan array.

## 14.4 Tugas Praktikum

Hasil Kode Program

![Screenshot](img/T1.png)

![Screenshot](img/T2.png)