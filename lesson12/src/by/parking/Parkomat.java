package by.parking;

import java.util.Scanner;

public class Parkomat {

    private Scanner scanner;

    public void helloMessage(String map) {
        System.out.println(map);
        System.out.println("Hello. Please enter license plate number");
    }

    public String readPlateNumber() {
        while (true) {
            System.out.print("plate number: ");
            if (scanner == null) {
                scanner = new Scanner(System.in);
            }
            String newPlateNumber = scanner.nextLine();
            if (newPlateNumber != null
                    && !"".equals(newPlateNumber.trim())) {
                return newPlateNumber;

            }
        }
    }

    public void showParkingFull() {
        System.out.println("There are no free places");
    }

    public void showParkedPlace(int placeNumber) {
        System.out.println("Successfully parked on place " + placeNumber);
    }

    public void showGoodBye(String plateNumber) {
        System.out.println("GoodBye " + plateNumber);
    }
}
