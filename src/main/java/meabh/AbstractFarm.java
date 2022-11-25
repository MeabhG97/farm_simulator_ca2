package meabh;

import java.util.ArrayList;

public abstract class AbstractFarm {
    private int id;
    private String farmer;
    private ArrayList<Shed> shedList;
    private ArrayList<Animal> animalList;

    public AbstractFarm(int id, String farmer){
        this.id = id;
        this.farmer = farmer;
        this.shedList = new ArrayList<>();
        this.animalList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFarmer() {
        return farmer;
    }

    public void setFarmer(String farmer) {
        this.farmer = farmer;
    }

    public ArrayList<Shed> getShedList() {
        return shedList;
    }

    public void setShedList(ArrayList<Shed> shedList) {
        this.shedList = shedList;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }
}
