package com.priocom.oss.activation;

import java.util.Optional;

public class Tst {
    public static void main(String[] args) {
        CarPlane c = new CarPlane();
        c.move();
        c.moveStatic();

        MyCarPlane mc = new MyCarPlane();

        mc.moveStatic();

        Car car  = new CarPlane();
        car.move();
        Car.moveStatic();

        Car cr = new MyCarPlane() ;
        Car oCar= Optional.of(cr).orElseThrow(() -> new NullPointerException("re"));




    }

    interface Car {
        default void move(){
            System.out.println("I am driving");
        }
        static void moveStatic(){
            System.out.println("I am driving Static");
        }
    }
    interface Airplane {
        default void move(){
            System.out.println("I am flying");
        }
        static void moveStatic(){
            System.out.println("I am flying Static");
        }
    }

    static class CarPlane implements Car, Airplane, Cloneable{
        int i=1;


        @Override
        public void move() {
            Car.super.move();
            Airplane.super.move();
        }
        public static void moveStatic(){
            System.out.println("I am Driving&Flying Static");
        }




    }

    static class MyCarPlane extends CarPlane{
        public static void moveStatic(){
            CarPlane.moveStatic();
            System.out.println("I am super Driving&Flying Static");
        }
    }
}
