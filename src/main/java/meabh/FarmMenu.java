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
        farmOptions.add("03. Edit shed");
        farmOptions.add("04. Delete shed");
        farmOptions.add("05. Print detail of shed");
        farmOptions.add("06. Add new animal");
        farmOptions.add("07. Edit animal");
        farmOptions.add("08. Delete animal");
        farmOptions.add("09. Print detail of animal");
        farmOptions.add("10. Print detail of farm");
        farmOptions.add("11. Milk all animals");
        farmOptions.add("12. Death of an animal");
        farmOptions.add("13. Milk collection");
        farmOptions.add("14. Print animals by value");
        farmOptions.add("15. Save");
        farmOptions.add("16. Load");
        farmOptions.add("17. Exit");
    }

    public void run(){
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

                System.out.println("Selection: [" + farmOptions.get(selection) + "]");

                switch(selection){
                    case 1 -> {
                        
                    }
                    case 2 -> {
                        
                    }
                    case 3 -> {
                        
                    }
                    case 4 -> {
                        
                    }
                    case 5 -> {
                        
                    }
                    case 6 -> {
                        
                    }
                    case 7 -> {
                        
                    }
                    case 8 -> {
                        
                    }
                    case 9 -> {
                        
                    }

                    case 10 -> {
                        
                    }
                    case 11 -> {
                        
                    }
                    case 12 -> {
                        
                    }
                    case 13 -> {
                        
                    }
                    case 14 -> {
                        
                    }
                    case 15 -> {
                        
                    }
                    case 16 -> {
                        
                    }
                    case 17 -> {
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
