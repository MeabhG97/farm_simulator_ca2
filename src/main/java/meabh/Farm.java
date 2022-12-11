package meabh;


import java.util.ArrayList;

public class Farm {
    private int id;
    private String farmer;
    private ArrayList<Shed> sheds;

    private static int farmCount = 0;

    public Farm(String farmer){
        this.id = farmCount;
        farmCount++;
        this.farmer = farmer;
        sheds = new ArrayList<>();
    }

    public void milkAllAnimals(){
        try{
            for(Shed shed : sheds){
                shed.milkAllAnimals();
            }
        }
        catch(IllegalStateException e){
            System.out.println(e);
        }
    }

    public void addShed(Shed shed){
        sheds.add(shed);
    }

    public void deathOfAnimal(int animalId){
        for(Shed shed : sheds){
            int animalIndex = shed.hasAnimal(animalId);
            if(animalIndex > -1){
                shed.removeAnimal(animalIndex);
            }
        }
    }

    public void milkCollection(){
        double total = 0;
        for(Shed shed : sheds){
            total += shed.emptyMilkTank();
        }
        System.out.println(total);
    }

    public int getId() {
        return id;
    }

    public String getFarmer() {
        return farmer;
    }

    public ArrayList<Shed> getSheds() {
        return sheds;
    }

}
