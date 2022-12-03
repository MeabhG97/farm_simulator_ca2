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
