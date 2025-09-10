package com.mycompany.praktikum1pbo;

import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum1pbo {

    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        
        namaMahasiswa.add("Ilanad");
        
        System.out.println(namaMahasiswa);
        
        for (String nama : namaMahasiswa) {System.out.println(nama);
        }
    }
}