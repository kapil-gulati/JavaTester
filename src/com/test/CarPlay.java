package com.test;

import com.test.parts.CarEngine;

public class CarPlay {
    public static void main(String[] args){
        try{
            CarEngine carEngine = new CarEngine();
            carEngine.setCylenders(6);
            Car pramitCar = new Car(carEngine, 4, "Pramit's sports Car");
            pramitCar.carModel();
            System.out.println(pramitCar.startEngine());
            System.out.println(pramitCar.applyBreak());


            Car kapilCar = pramitCar.makeCopy();
            kapilCar.setName("Kapil stole it");
            kapilCar.carModel();

            pramitCar.carModel();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
