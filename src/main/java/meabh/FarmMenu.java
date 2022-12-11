package meabh;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FarmMenu {
    private static Scanner keyboardScanner = new Scanner(System.in);
    private static ArrayList<String> farmOptions = new ArrayList<>();
    

    public static void FarmMenuAddOptions(){
        farmOptions.add("01. Add new farm");
        farmOptions.add("02. Add new shed");
        farmOptions.add("03. Delete shed");
        farmOptions.add("04. Print detail of shed");
        farmOptions.add("05. Add new animal");
        farmOptions.add("06. Edit animal");
        farmOptions.add("07. Delete animal");
        farmOptions.add("08. Print detail of animal");
        farmOptions.add("09. Print detail of farm");
        farmOptions.add("10. Milk all animals");
        farmOptions.add("11. Death of an animal");
        farmOptions.add("12. Milk collection");
        farmOptions.add("13. Print animals by value");
        farmOptions.add("14. Save");
        farmOptions.add("15. Load");
        farmOptions.add("16. Exit");
    }

    public static void run(){
        System.out.println("Welcome");
        FarmMenuAddOptions();
        boolean run = true;
        while(run){
            try{
                System.out.println("Please select an option:");
                for(int i = 0; i < farmOptions.size(); i++){
                    System.out.println(farmOptions.get(i));
                }
                int selection = keyboardScanner.nextInt();

                System.out.println("Selection: [" + farmOptions.get(selection - 1) + "]");

                switch(selection){
                    case 1 -> {
                        FarmManager.addFarm();
                    }
                    case 2 -> {
                        FarmManager.addShed();
                    }
                    case 3 -> {
                        FarmManager.deleteShed();
                    }
                    case 4 -> {
                        FarmManager.printShed();
                    }
                    case 5 -> {
                        FarmManager.addAnimal();
                    }
                    case 6 -> {
                        FarmManager.editAnimal();
                    }
                    case 7 -> {
                        FarmManager.deleteAnimal();
                    }
                    case 8 -> {
                        FarmManager.printAnimal();
                    }
                    case 9 -> {
                        FarmManager.printFarm();
                    }

                    case 10 -> {
                        FarmManager.milkAllAnimals();
                    }
                    case 11 -> {
                        FarmManager.deathAnimal();
                    }
                    case 12 -> {
                        FarmManager.milkCollection();
                    }
                    case 13 -> {
                        FarmManager.printValue();
                    }
                    case 14 -> {
                        FarmManager.save();
                    }
                    case 15 -> {
                        FarmManager.load();
                    }
                    case 16 -> {
                        run = false;
                    }
                }
            }
            catch(InputMismatchException e){
                System.out.println("Error: Input was not an integer.");
                //Clear the scanner
                keyboardScanner.nextLine();
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Error: Menu option does not exist.");
            }
        }
    }
}
