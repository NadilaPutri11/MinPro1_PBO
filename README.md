# PostTest1_PBO
Nadila Putri - 2409116052 
Tema: Manajamen Resep Masakan

## Deskripsi
Program ini adalah program sederhana di Java untuk mengelola daftar resep masakan.
Di dalam program ini kita bisa:
- menambah resep,
- melihat daftar resep,
- mengubah resep,
- menghapus resep,
- dan keluar dari program.
Program ini menggunakan ArrayList untuk menyimpan data resep dan menu dipilih dengan menginputkan angka saat running.
1. Mendefinisikan package program serta mengimpor library ArrayList dan Scanner.
   <img width="1321" height="157" alt="image" src="https://github.com/user-attachments/assets/a4d8cafa-77d9-42ca-9f71-7c528a96fffb" />

2. Memvalidasi input agar hanya berupa angka dan mengembalikan hasilnya dalam bentuk integer.
   <img width="1321" height="450" alt="image" src="https://github.com/user-attachments/assets/c276a51c-8ac0-4540-add0-d082bd02c37c" />

3. Menyiapkan wadah (ArrayList) untuk daftar resep, scanner input, dan variabel pilihan menu.
   <img width="1330" height="183" alt="image" src="https://github.com/user-attachments/assets/b041c4f2-1587-4946-a5ca-eb61cdfa5d42" />

4. Menampilkan daftar menu dan meminta user memilih opsi yang tersedia.
   <img width="1326" height="353" alt="image" src="https://github.com/user-attachments/assets/5cef42e4-1837-4aa9-a948-3dd17d3176ff" />

5. Menambahkan resep baru yang dimasukkan user ke dalam daftar resep.
   <img width="1329" height="240" alt="image" src="https://github.com/user-attachments/assets/8bd09154-7f59-4ea2-9f4c-1bd992a1eef4" />

6. Menampilkan seluruh resep yang tersimpan atau pesan jika daftar masih kosong.
   <img width="1382" height="364" alt="image" src="https://github.com/user-attachments/assets/4460c7d8-c05d-4916-94c0-7c458d559237" />

7. Mengganti nama resep lama dengan resep baru berdasarkan nomor yang dipilih user.
   <img width="1372" height="672" alt="image" src="https://github.com/user-attachments/assets/821c4325-762b-4666-9315-70415bc225c0" />

8. Menghapus resep dari daftar berdasarkan nomor yang dipilih user.
   <img width="1364" height="605" alt="image" src="https://github.com/user-attachments/assets/548ff975-8aff-4425-b2a1-43f5fdf70ef7" />

9. Menampilkan pesan penutup dan menghentikan perulangan untuk keluar dari aplikasi.
   <img width="2204" height="148" alt="image" src="https://github.com/user-attachments/assets/9ff4c66b-7d3b-431f-af01-dc8cf0d0e771" />

10. Menangani jika user memasukkan angka yang bukan opsi menu (misalnya 6 atau angka negatif) dengan menampilkan "Pilihan tidak valid, coba lagi." lalu melanjutkan loop sehingga menu ditampilkan ulang.
   <img width="1326" height="177" alt="image" src="https://github.com/user-attachments/assets/e1eacd9d-1703-45fd-bf44-9dfbb8f4d5c6" />

11. Menutup objek Scanner setelah program selesai dijalankan.
   <img width="1332" height="131" alt="image" src="https://github.com/user-attachments/assets/efdf41c9-2c26-4786-bb85-0136436b5d5c" />

## Alur Program
1. Program menampilkan menu utama:
   - Tambah resep
   - Lihat resep
   - Ubah resep
   - hapus resep
   - keluar
2. User memilih menu dengan menginputkan angka.
   <img width="754" height="249" alt="image" src="https://github.com/user-attachments/assets/153e502d-2ae4-4e30-8f52-ab9df9637ef2" />
3. Jika user memilih "Tambah", user menginputkan nama resep yang nantinya akan disimpan ke dalam ArrayList.
   <img width="1298" height="471" alt="image" src="https://github.com/user-attachments/assets/26b1d7b2-9fa6-4592-a399-bb81f28903fb" />
4. Jika user memilih "Lihat", program akan menampilkan daftar resep yang ada atau .
   <img width="1194" height="398" alt="image" src="https://github.com/user-attachments/assets/7f252fcf-c68b-460c-8ed2-b4ac7747e110" />
   <img width="1212" height="505" alt="image" src="https://github.com/user-attachments/assets/d486d5a8-d5fc-4e8a-912e-bd77e180ac54" />
5. Jika user memilih "Ubah", user menginputkan nomor resep yang namanya akan diubah lalu menginputkan nama baru untuk penggantinya.
   <img width="1333" height="566" alt="image" src="https://github.com/user-attachments/assets/17c37ad3-ebc8-447d-b894-ddc515989502" />
6. Jika user memilih "Hapus", user menginputkan nomor nama resep yang ingin dihapus.
   <img width="1429" height="1235" alt="image" src="https://github.com/user-attachments/assets/b337a7fd-ff56-4f08-8d2a-9b8f0f393a65" />
7. Program akan terus berjalan sampai user memilih menu "Keluar".
   <img width="1993" height="529" alt="image" src="https://github.com/user-attachments/assets/38d36167-f7d7-4c8d-afcb-e12fba3bfcb9" />


