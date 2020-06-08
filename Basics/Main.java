package Basics;
import java.awt.*;
public class Main {
        public static void main(String[] args) {
            System.out.println("Hello World");
            System.out.println("Akash");

            Car myCar = new Car(12.4,"3D2OBN", "BLACK", false);
            Car sallyCar = new Car(13.9, "1BC32E", "BLUE", true );

            System.out.println("My Car's License Plate: " + myCar.licensePlate);
            System.out.println("Sally's License Plate: " + sallyCar.licensePlate);
            System.out.println(myCar.paintColor);
            myCar.changePaintColor("RED");
            System.out.println(myCar.paintColor.toString());
        }
    }