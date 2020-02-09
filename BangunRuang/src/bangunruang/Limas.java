/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ADAM ARDI
 */
public class Limas {
    double tinggiS(double sisi){
        double s= sisi/2;
        double t = Math.sqrt((sisi*sisi)-(s*s));
        return t;
    }
    double Lalas (double sisi, double tinggiA){
        double l = (sisi*tinggiA/2);
        return l;
    }
    double volume (double luas, double tinggiL){
        double v = (luas*tinggiL)/3;
        return v;
    }
    double tinggiT(double sisi, double rusuk){
        double s= sisi/2;
        double t = Math.sqrt((rusuk*rusuk)-(s*s));
        return t;
    }
    double luas1 (double sisi, double tinggiT){
      
        return (sisi*tinggiT)/2;
    }
    
    
    double lp (double luas,double luasA){
        double lp = luas+(luasA*3);
        return lp;
    }
}
