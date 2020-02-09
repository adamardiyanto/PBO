/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pilihan = ");
        System.out.println("1.Balok ");
        System.out.println("2. kerucut ");
        System.out.println("3. Limas segitiga sama sisi ");
        Scanner a = new Scanner(System.in);
        System.out.println("masukan pilihan = ");
        int pilihan = a.nextInt();
        switch(pilihan){
            case 1 :
                 Scanner angka = new Scanner(System.in);
                 System.out.println("panjang = ");
                 double panjang = angka.nextInt();
                 System.out.println("lebar = ");
                 double lebar = angka.nextInt();
                 System.out.println("tinggi = ");
                 double tinggi = angka.nextInt();
                Balok balok = new Balok();
                double hasil1 = balok.volume(panjang,lebar,tinggi);
                double hasil2 = balok.lp(panjang, lebar, tinggi);
                System.out.println("volume = "+hasil1);
                System.out.println("luas = "+hasil2);
                break;
            case 2 :
                Scanner angka2 = new Scanner(System.in);
                 System.out.println("jari 2 = ");
                 double jari = angka2.nextInt();
                 System.out.println("tinggi = ");
                 double tinggiK = angka2.nextInt();
                 Kerucut kerucut= new Kerucut();
                double hasil3 = kerucut.volume(jari, tinggiK);
                double hasil4 = kerucut.pelukis(jari, tinggiK);
                double hasil5 = kerucut.lp(jari, tinggiK, hasil4);
                System.out.println("volume = "+hasil3);
                System.out.println("luas = "+hasil5);
                break;
            case 3 :
                Scanner angka3 = new Scanner(System.in);
                 System.out.print("sisi segitiga alas limas= ");
                 double sisi = angka3.nextDouble();
                 System.out.print("rusuk tegak = ");
                 double rusuk = angka3.nextDouble();
                 System.out.print("tinggi = ");
                 double tinggiL = angka3.nextDouble();
                 
                 Limas limas = new Limas();
                 double tinggiA = limas.tinggiS(sisi);
                 double luas = limas.Lalas(sisi, tinggiA);
                 double hasil6 = limas.volume(luas, tinggiL);
                 double tinggiT = limas.tinggiT(sisi,rusuk);
                 double luasA = limas.luas1(sisi, tinggiT);
                 double luasP = limas.lp(luas, luasA);
                 System.out.println("volume = "+hasil6);
                break;
        }
    }
    
}
