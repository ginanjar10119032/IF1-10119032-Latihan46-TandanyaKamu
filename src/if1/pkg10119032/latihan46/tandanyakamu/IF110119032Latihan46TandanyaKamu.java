/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan46.tandanyakamu;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk mengklasifikasikan golongan usia
 * dengan pendekatan berorientasi objek
 */
public class IF110119032Latihan46TandanyaKamu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Age usia = new Age(2020);
        
        System.out.print("Masukan Tahun Lahir Anda : ");
        usia.setYearBirth(input.nextInt());
        
        
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + usia.getYearBirth());
        System.out.println("Hari ini Tahun : " + usia.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + usia.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu ".concat(usia.tandanyaKamu(usia.hitungUmur())));
        
        
    }
}