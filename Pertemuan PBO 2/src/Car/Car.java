/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author LABRPL-21
 */
public class Car {
        int Cadence,Speed,Gear;
        void changeCadence(int ubahCadence){
            Cadence = ubahCadence;
        }
        void speedUp(int ubahSpeed){
            Speed = ubahSpeed;
        }
        void changeGear (int ubahGear){
            Gear =ubahGear;
        }
        void printInfo(){
             System.out.println(
        "Cadence : "+ Cadence +"\n"+
        "Speed : "+ Speed +"\n"+
        "Gear : "+ Gear +"\n");
        }
    
}
