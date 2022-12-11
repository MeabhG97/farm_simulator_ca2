package meabh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FarmManager {
    private static Scanner keyboardScanner = new Scanner(System.in);

    public static ArrayList<Farm> farmList = new ArrayList<>();

    public static void addFarm(){
        System.out.println("Enter farmer name:");
        String farmerName = keyboardScanner.nextLine();
        Farm farm = new Farm(farmerName);
        farmList.add(farm);
    }

    public static void addShed(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");

            System.out.println("Enter shed milk tank size:");

            if(keyboardScanner.hasNextInt()){
                int size = keyboardScanner.nextInt();
                MilkTank tank = new MilkTank(size);
                Shed shed = new Shed(tank);
                farmList.get(selection).addShed(shed);
            }
            else{
                Shed shed = new Shed();
                farmList.get(selection).addShed(shed);
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

    public static void deleteShed(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");
            Farm f = farmList.get(selection);

            try{
                System.out.println("Select Shed");
                for(int i = 0; i < f.getSheds().size(); i++){
                    System.out.println("Shed " + (i+1));
                }
                selection = keyboardScanner.nextInt();
    
                System.out.println("Selection: [Shed " + selection + "]");
                
                f.getSheds().remove(selection);
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
        catch(InputMismatchException e){
            System.out.println("Error: Input was not an integer.");
            //Clear the scanner
            keyboardScanner.nextLine();
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Error: Menu option does not exist.");
        }
    }

    public static void printShed(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");
            Farm f = farmList.get(selection);

            try{
                System.out.println("Select Shed");
                for(int i = 0; i < f.getSheds().size(); i++){
                    System.out.println("Shed " + (i+1));
                }
                selection = keyboardScanner.nextInt();
    
                System.out.println("Selection: [Shed " + selection + "]");
                
                System.out.println(f.getSheds().get(selection).toString());
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
        catch(InputMismatchException e){
            System.out.println("Error: Input was not an integer.");
            //Clear the scanner
            keyboardScanner.nextLine();
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Error: Menu option does not exist.");
        }
    }

    public static void addAnimal(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");
            Farm f = farmList.get(selection);

            try{
                System.out.println("Select Shed");
                for(int i = 0; i < f.getSheds().size(); i++){
                    System.out.println("Shed " + (i+1));
                }
                selection = keyboardScanner.nextInt();
    
                System.out.println("Selection: [Shed " + selection + "]");
                
                Shed s = f.getSheds().get(selection);

                System.out.println("Select animal type");
                System.out.println("1. Dairy Cow");
                System.out.println("2. Beef Cow");
                System.out.println("3. Goat");
                System.out.println("4. Sheep");

                if(keyboardScanner.hasNextInt()){
                    int sel = keyboardScanner.nextInt();
                    switch(sel){
                        case 1 -> {
                            System.out.println("Enter name:");
                            String str = keyboardScanner.nextLine();
                            DairyCow dc = new DairyCow(str);
                            s.addAnimal(dc);
                        }
                        case 2 -> {
                            s.addAnimal(new BeefCow());
                        }
                        case 3 -> {
                            s.addAnimal(new Goat());
                        }
                        case 4 ->{
                            s.addAnimal(new Sheep());
                        }
                        default ->{
                            System.out.println("Not a valide selection");
                        }
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
        catch(InputMismatchException e){
            System.out.println("Error: Input was not an integer.");
            //Clear the scanner
            keyboardScanner.nextLine();
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Error: Menu option does not exist.");
        }
    }

    public static void editAnimal(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");
            Farm f = farmList.get(selection);

            try{
                System.out.println("Select Shed");
                for(int i = 0; i < f.getSheds().size(); i++){
                    System.out.println("Shed " + (i+1));
                }
                selection = keyboardScanner.nextInt();
    
                System.out.println("Selection: [Shed " + selection + "]");
                
                Shed s = f.getSheds().get(selection);

                try{
                    System.out.println("Select Animal");
                    for(int i = 0; i < s.getHerd().size(); i++){
                        System.out.println("Animal " + (i+1));
                    }
                    selection = keyboardScanner.nextInt();
        
                    System.out.println("Selection: [Animal " + selection + "]");
                    
                    Animal a = s.getHerd().get(selection);

                    if(a instanceof DairyCow){
                        System.out.println("Enter new name:");
                        String str =  keyboardScanner.nextLine();
                        DairyCow dc = (DairyCow)a;
                        dc.setName(str);
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
            catch(InputMismatchException e){
                System.out.println("Error: Input was not an integer.");
                //Clear the scanner
                keyboardScanner.nextLine();
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Error: Menu option does not exist.");
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
    
    public static void deleteAnimal(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");
            Farm f = farmList.get(selection);

            try{
                System.out.println("Select Shed");
                for(int i = 0; i < f.getSheds().size(); i++){
                    System.out.println("Shed " + (i+1));
                }
                selection = keyboardScanner.nextInt();
    
                System.out.println("Selection: [Shed " + selection + "]");
                
                Shed s = f.getSheds().get(selection);

                try{
                    System.out.println("Select Animal");
                    for(int i = 0; i < s.getHerd().size(); i++){
                        System.out.println("Animal " + (i+1));
                    }
                    selection = keyboardScanner.nextInt();
        
                    System.out.println("Selection: [Animal " + selection + "]");
                    
                    s.getHerd().remove(selection);
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
            catch(InputMismatchException e){
                System.out.println("Error: Input was not an integer.");
                //Clear the scanner
                keyboardScanner.nextLine();
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Error: Menu option does not exist.");
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

    public static void printAnimal(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");
            Farm f = farmList.get(selection);

            try{
                System.out.println("Select Shed");
                for(int i = 0; i < f.getSheds().size(); i++){
                    System.out.println("Shed " + (i+1));
                }
                selection = keyboardScanner.nextInt();
    
                System.out.println("Selection: [Shed " + selection + "]");
                
                Shed s = f.getSheds().get(selection);

                try{
                    System.out.println("Select Animal");
                    for(int i = 0; i < s.getHerd().size(); i++){
                        System.out.println("Animal " + (i+1));
                    }
                    selection = keyboardScanner.nextInt();
        
                    System.out.println("Selection: [Animal " + selection + "]");
                    
                    System.out.println(s.getHerd().get(selection).toString());
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
            catch(InputMismatchException e){
                System.out.println("Error: Input was not an integer.");
                //Clear the scanner
                keyboardScanner.nextLine();
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Error: Menu option does not exist.");
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

    public static void printFarm(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");
            System.out.println(farmList.get(selection).toString());            
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

    public static void milkAllAnimals(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");
            farmList.get(selection).milkAllAnimals();           
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

    public static void deathAnimal(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");

            System.out.println("Enter animal id");

            if(keyboardScanner.hasNextInt()){
                int id = keyboardScanner.nextInt();
                farmList.get(selection).deathOfAnimal(id);
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

    public static void milkCollection(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");
            farmList.get(selection).milkCollection();          
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

    public static void printValue(){
        try{
            System.out.println("Select farm");
            for(int i = 0; i < farmList.size(); i++){
                System.out.println("Farm " + (i+1));
            }
            int selection = keyboardScanner.nextInt();

            System.out.println("Selection: [Farm " + selection + "]");

            Farm f = farmList.get(selection);
            ArrayList<Animal> allAnimals = new ArrayList<>();
            for(int i = 0; i < f.getSheds().size(); i++){
                allAnimals.addAll(f.getSheds().get(i).getHerd());
            }

            Collections.sort(allAnimals);
            for(int i = 0; i < allAnimals.size(); i++){
                Animal a = allAnimals.get(i);
                System.out.println("Animal " + a.getAnimalId() + " Value: " + a.getValue());
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
