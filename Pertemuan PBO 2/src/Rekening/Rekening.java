/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekening;

/**
 *
 * @author LABRPL-21
 */
public class Rekening  {
    float Saldo = 0F;
    int no_rekening = 1234567890;
    String Nama="HYS";
    
    void cek_saldo(){
        System.out.println("Saldo anda : "+ Saldo);
    }
    void menabung (int isi_Tabungan){
        Saldo = Saldo + isi_Tabungan;
        System.out.println("Anda menabung Rp."+isi_Tabungan+" \n Saldo anda saat ini : Rp."+ Saldo);
    }
    void menarik(int tarik_Tunai){
        Saldo = Saldo - tarik_Tunai;
        System.out.println("Anda Menarik Uang Rp."+tarik_Tunai+" \n Saldo anda saat ini: Rp."+ Saldo);
    }
    void transfer(int Transfer){
        Saldo = Saldo - Transfer;
        System.out.println("Anda Mentransfer Uang Rp."+Transfer+" \n Saldo anda saat ini: Rp."+ Saldo);        
    }
}
