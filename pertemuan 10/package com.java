package com.company;
import java.util.Scanner;

public class Main11 {
    static void menu() {
        System.out.println("============================");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("============================");
        System.out.println(" 1. Tambah data penerima vaksin");
        System.out.println(" 2. Hapus data penerima vaksin");
        System.out.println(" 3. Daftar penerima vaksin");
        System.out.println(" 0. Keluar");
        System.out.println("============================");
        System.out.print("Pilih : ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc18 = new Scanner(System.in);
        Scanner str18 = new Scanner(System.in);
        System.out.println("Nama : Deeva Rindu Wijarista Putri (09)\n");
        Dll data = new Dll();
        int pilih = 0;
        do {
            menu();
            pilih = sc18.nextInt();
            switch (pilih) {
                case 1: {
                    System.out.println("----------------------------");
                    System.out.println("Masukkan data penerima vaksin");
                    System.out.println("----------------------------");
                    System.out.print("Nomor antrian : ");
                    int no = sc18.nextInt();
                    System.out.print("Nama penerima : ");
                    String nama = str18.nextLine();
                    data.daftar(no, nama);
                    break;
                }
                case 2: {
                    data.hapus();
                    break;
                }
                case 3: {
                    data.print();
                    break;
                }
                default: {
                    if (pilih > 3 || pilih < 0) {
                        System.out.println("Pilihan anda salah!");
                    }
                    break;
                }
            }
        } while (pilih != 0);
    }
}
