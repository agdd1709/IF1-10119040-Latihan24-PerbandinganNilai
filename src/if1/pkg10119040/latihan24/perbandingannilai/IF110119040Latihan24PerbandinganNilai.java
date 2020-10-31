/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan24.perbandingannilai;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama     : Agus Deri Dermawan
 * Kelas    : IF1
 * NIM      : 10119040
 * Program membandingkan nilai
 */
public class IF110119040Latihan24PerbandinganNilai {

    public static void banding(int nilai1, int nilai2){
        if(nilai1==nilai2){
            System.out.println("Hasil : " + nilai1 + " Sama dengan " + nilai2);
        } else if (nilai1>nilai2){
            System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2);
        } else {
            System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2);
        }
    }
    public static void main(String[] args) {
        int nilai1;
        int nilai2;
        String ulang;
        boolean kondisi;
        
        System.out.println("========Program Perbandingan Nilai========");
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = input.nextInt();
            System.out.print("Masukkan nilai kedua   : ");
            nilai2 = input.nextInt();
            banding(nilai1,nilai2);
            System.out.println("");
            System.out.println("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulang = input.next();
            kondisi = "Ya".equals(ulang);
        } while(kondisi == true);
    }
    
}
