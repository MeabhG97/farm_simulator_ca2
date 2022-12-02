package meabh;


import java.util.ArrayList;

public class Farm {
    private int id;
    private String farmer;
    private ArrayList<Shed> sheds;

    public Farm(String farmer){
        this.farmer = farmer;
        sheds = new ArrayList<>();
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
