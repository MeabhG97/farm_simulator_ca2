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
        for(Shed shed : sheds){
            shed.milkAllAnimals();
        }
    }

    public void deathOfAnimal(int animalId){
        for(Shed shed : sheds){
            int animalIndex = shed.hasAnimal(animalId);
            if(animalIndex> -1){
                shed.removeAnimal(animalIndex);
            }
        }
    }

    public void mikCollection(){
        double total = 0;
        for(Shed shed : sheds){
            total += shed.emmptyMilkTank();
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
