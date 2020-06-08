package Basics;

import java.util.SplittableRandom;

public class Car {
        int averageMilesPerGallon;
        String licensePlate;
        String paintColor;
        boolean areTailingWorking;
        public Car(double inputAverageMPG,
                   String inputLicensePlate,
                   String inputPaintColor,
                   boolean inputAreTaillightsWorking) {
            this.averageMilesPerGallon = (int) inputAverageMPG;
            this.licensePlate = inputLicensePlate;
            this.paintColor = inputPaintColor;
            this.areTailingWorking = inputAreTaillightsWorking;
        }
    public void changePaintColor(String newPaintColor) {
            this.paintColor = newPaintColor;
        }
    }