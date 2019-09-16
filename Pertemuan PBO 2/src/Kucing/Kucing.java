/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kucing;

/**
 *
 * @author LABRPL-21
 */
public class Kucing {
        String warna_bulu;
        int umur;
        
        void pasangUmur(int Wah_Umur){
            umur = Wah_Umur;
        }
        void meong(String ini_warna){
            warna_bulu = ini_warna ;
        }
        void printInfo(){
             System.out.println(
        "Umur kucing : "+ umur +" bulan \n"+
        "warna Kucing : "+ warna_bulu +"\n"
        );  
}
}
