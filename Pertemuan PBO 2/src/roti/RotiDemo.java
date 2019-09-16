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
public class RotiDemo {
    public static void main(String[] args) {
        Roti roti = new Roti();
        roti.beriWarna("Hijau");
        roti.beriRasa("Pandan");
        roti.timbangBerat(30);
        roti.hargaJual(6000);
        roti.inforoti();
        
        System.out.println();
        
        Roti rotiCoklat = new Roti();
        rotiCoklat.beriWarna("Coklat");
        rotiCoklat.beriRasa("Coklat");
        rotiCoklat.timbangBerat(40);
        rotiCoklat.hargaJual(8000);
        rotiCoklat.inforoti();
        
        System.out.println();
        
        Roti rotiSusu = new Roti();
        rotiSusu.beriWarna("Putih Tulang");
        rotiSusu.beriRasa("Susu");
        rotiSusu.timbangBerat(35);
        rotiSusu.hargaJual(7000);
        rotiSusu.inforoti();
        
        System.out.println();
        
        Roti rotiKacangMerah = new Roti();
        rotiKacangMerah.beriWarna("Merah Kecoklat");
        rotiKacangMerah.beriRasa("Kacang Merah");
        rotiKacangMerah.timbangBerat(50);
        rotiKacangMerah.hargaJual(10000);
        rotiKacangMerah.inforoti();
    }
    
}
