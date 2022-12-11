package meabh;

import java.util.Scanner;

public class FarmManager {
    private static Scanner keyboardScanner = new Scanner(System.in);

    public static void addFarm(){
        System.out.println("Enter farmer name:");
        String farmerName = keyboardScanner.nextLine();
    }
}
