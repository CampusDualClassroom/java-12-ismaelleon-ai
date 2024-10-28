package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Citroën", "Xsara", "Diésel");
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.turnAngleOfWheels(20);
        myCar.turnAngleOfWheels(-200);
        myCar.setReverse(true);
        myCar.stop();
        myCar.showDetails();
    }
}