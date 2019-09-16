/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roti;

/**
 *
 * @author LABRPL-21
 */
public class Roti {
    String warna;
    String rasa;
    int berat;
    double harga;
    
    void beriWarna(String warnaRoti){
        warna = warnaRoti;
    }
    void beriRasa(String rasaRoti){
        rasa = rasaRoti;
    }
    void timbangBerat(int beratRoti){
        berat = beratRoti;
    }
    void hargaJual(double hargaRoti){
         harga = hargaRoti;
    }
    void inforoti(){
        System.out.println(
        "Warna Roti : "+ warna +"\n"+
        "Rasa Roti : "+ rasa +"\n"+
        "Berat Roti : "+ berat +"gr \n"+
        "harga Roti : Rp."+ harga
        );
    }
}  
    
