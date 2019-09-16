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
public class HewanDemo {
    public static void main(String[] args) {
        Hewan Harimau = new Hewan();
        Hewan Kerbau = new Hewan();
        
        Harimau.hnama("Harimau");
        Harimau.jkaki(4);
        Harimau.Makan("Daging");
        Harimau.Type("Karinivora");
        
        Kerbau.hnama("Kerbau");
        Kerbau.jkaki(4);
        Kerbau.Makan("Rumput");
        Kerbau.Type("Karnivora");
        
        Harimau.PrintClass();
        System.out.println("\n");
        Kerbau.PrintClass();
        System.out.println("\n");
    }
}
