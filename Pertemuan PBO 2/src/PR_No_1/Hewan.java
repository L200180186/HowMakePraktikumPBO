/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR_No_1;

/**
 *
 * @author Administrator
 */
public class Hewan {
    String Nama,makan,type;
    int JKaki;
   void hnama (String namaHewan){
       Nama = namaHewan ;
   }
   void jkaki (int JumlahKaki){
       JKaki = JumlahKaki ;
   }
   void Makan(String Makanan){
       makan = Makanan;
   }
   void Type(String Tipe){
       type = Tipe;
   }
   void PrintClass(){
       System.out.print(
              "Nama Hewan : "+Nama+"\n"+
              "Jumlah Kaki : "+JKaki+"\n"+
              "Makanan : "+makan+"\n"+
              "Type Hewan : "+type
       );
   }
}
