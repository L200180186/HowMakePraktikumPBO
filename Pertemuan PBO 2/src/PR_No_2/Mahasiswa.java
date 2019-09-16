/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR_No_2;

/**
 *
 * @author Administrator
 */
public class Mahasiswa{
    String nama,alamat,nim;
    int semester;
    void tampilkanNama(){
        System.out.println("Nama        : "+nama);
    }
    void tampilkanNim(){
        System.out.println("NIM         : "+nim);
    }
    void tampilkanAlamat(){
        System.out.println("Alamat      : "+alamat);
    }
    void tampilkanSemester(){
        System.out.println("Semester    : "+semester);
    }
}