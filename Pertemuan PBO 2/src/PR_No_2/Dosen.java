/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR_No_2;
import java.util.Date;

public class Dosen {
    String nama,pendidikan;
    int nik;
    Date tglLahir;
    void tampilkanNama(){
        System.out.println("Nama            : "+nama);
    }
    void tampilkanTglLahir(){
        System.out.println("Tanggal Lahir   : "+tglLahir);
    }
    void tampilkanNik(){
        System.out.println("NIK             : "+nik);
    }
}