package com.mycompany.resepmakanan;

import java.util.ArrayList;
import java.util.Scanner;

public class Resepmakanan {
    public static void main(String[] args) {
        ArrayList<String> resepMasakan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.println("\n=== MENU MANAJEMEN RESEP MAKANAN ===");
            System.out.println("1. Tambah Resep");
            System.out.println("2. Lihat Resep");
            System.out.println("3. Ubah Resep");
            System.out.println("4. Hapus Resep");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            String inputUser = input.nextLine();
            
            if (!inputUser.matches("\\d+")) {
                System.out.println("Input hanya boleh berupa angka!");
                continue; 
            }
            
            pilihan = Integer.parseInt(inputUser);

            if (pilihan == 1) {
                System.out.print("Masukkan nama resep: ");
                String resep = input.nextLine();
                resepMasakan.add(resep);
                System.out.println("Resep berhasil ditambahkan!");

            } else if (pilihan == 2) {
                if (resepMasakan.isEmpty()) {
                    System.out.println("Belum ada resep yang tersimpan.");
                } else {
                    System.out.println("Daftar Resep:");
                    for (int i = 0; i < resepMasakan.size(); i++) {
                        System.out.println((i + 1) + ". " + resepMasakan.get(i));
                    }
                }

            } else if (pilihan == 3) {
                if (resepMasakan.isEmpty()) {
                    System.out.println("Belum ada resep untuk diubah.");
                } else {
                    System.out.println("Pilih nomor resep yang ingin diubah:");
                    for (int i = 0; i < resepMasakan.size(); i++) {
                        System.out.println((i + 1) + ". " + resepMasakan.get(i));
                    }
                    int index = input.nextInt();
                    input.nextLine(); 
                    if (index > 0 && index <= resepMasakan.size()) {
                        System.out.print("Masukkan nama resep baru: ");
                        String resepBaru = input.nextLine();
                        resepMasakan.set(index - 1, resepBaru);
                        System.out.println("Resep berhasil diubah!");
                    } else {
                        System.out.println("Nomor resep tidak valid.");
                    }
                }

            } else if (pilihan == 4) {
                if (resepMasakan.isEmpty()) {
                    System.out.println("Belum ada resep untuk dihapus.");
                } else {
                    System.out.println("Pilih nomor resep yang ingin dihapus:");
                    for (int i = 0; i < resepMasakan.size(); i++) {
                        System.out.println((i + 1) + ". " + resepMasakan.get(i));
                    }
                    int index = input.nextInt();
                    input.nextLine(); 
                    if (index > 0 && index <= resepMasakan.size()) {
                        resepMasakan.remove(index - 1);
                        System.out.println("Resep berhasil dihapus!");
                    } else {
                        System.out.println("Nomor resep tidak valid.");
                    }
                }

            } else if (pilihan == 5) {
                System.out.println("Program selesai. Terima kasih!");
                break;

            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }

        input.close();
    }
}
