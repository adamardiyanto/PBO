/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Lab Informatika
 */
public class Kerucut {
    final double phi = 3.14;
    double volume(double jari,double tinggi){
        double v = (phi*jari*jari*tinggi*1/3);
        return v; }
    double pelukis (double jari,double tinggi){ 
        double t2 = tinggi/2;
        double hasil = Math.sqrt((jari*jari)+(t2*t2));
        return hasil; }
    double lp(double jari, double tinggi, double pelukis){
        double luas = (phi*jari*(jari+pelukis));
    return luas;}
}
