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
public class Balok {
    double volume(double panjang, double lebar, double tinggi){
    return panjang*lebar*tinggi;}
    
    double lp(double panjang, double lebar, double tinggi){
    return 2*(panjang*lebar+lebar*tinggi+tinggi*panjang);}
}
