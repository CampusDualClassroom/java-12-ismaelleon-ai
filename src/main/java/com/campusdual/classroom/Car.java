package com.campusdual.classroom;



public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }
    public Car(){

    }
    public boolean isTachometerGreaterThanZero(){
        return this.tachometer>0;
    }
    public boolean isTachometerEqualToZero(){
        return this.tachometer==0;
    }

    public void start(){
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop (){
        if (this.speedometer == 0 && this.tachometer>0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primero ten que estar detido");
        }
    }

    public void accelerate(){
        do {
            if (tachometer > 0) {
                if (speedometer < MAX_SPEED) {
                    speedometer+=10;

                } else {
                    System.out.println("Has alcanzado la velocidad máxima");
                }
            } else {
                System.out.println("No puedes acelerar, el coche está apagado");
            }
        } while (speedometer < MAX_SPEED);
    }

    public void brake(){
        do {
            if (speedometer > 0) {
                speedometer -= 10;
            } else {
                speedometer = 0;
                tachometer = 1000;
                System.out.println("El coche se ha detenido");
            }
        } while (speedometer>0);
    }

    public void turnAngleOfWheels(int angle){
        if(this.wheelsAngle <= 45 && this.wheelsAngle >= -45){
            if(this.wheelsAngle + angle <= 45 && this.wheelsAngle + angle >= -45){
                this.wheelsAngle = this.wheelsAngle + angle;
                System.out.println("El volante se ha girado " + this.wheelsAngle + " grados");
            } else {
                if (angle > 0){
                    this.wheelsAngle = 45;
                } else {
                    this.wheelsAngle = -45;
                }
                System.out.println("No se puede girar más de 45 grados");
            }

        }
    }

    public boolean isReverse(){
        return this.reverse;
    }

    public void setReverse (boolean reverse) {
        if (reverse && this.speedometer == 0) {
            this.reverse=true;
            this.gear= "R";
            System.out.println("Marcha atrás activada");
        } else if (!reverse){
            this.reverse =false;
            this.gear= "N";
            System.out.println("Marcha atrás desactivada");
        } else {
            System.out.println("No se puede poner marcha atrás con el vehículo en movimiento");
        }
    }
    public void showDetails(){
        System.out.println("Velocidad: "+speedometer+"Km/h RPM: "+tachometer+" Ángulo de las ruedas: "+wheelsAngle);
    }
}
