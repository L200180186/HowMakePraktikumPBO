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
public class RekeningDemo {
    public static void main(String[] args) {
        Rekening HYS = new Rekening();
        HYS.cek_saldo();
        HYS.menabung(100000);
        HYS.menarik(50000);
        HYS.transfer(20000);
    }
}
