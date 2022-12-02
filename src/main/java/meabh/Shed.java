package meabh;

import java.util.ArrayList;

public class Shed {
    private int id;
    private MilkingMachine machine;
    private MilkTank tank;
    private ArrayList<Animal> herd;

    public Shed(MilkTank tank){
        this.tank = tank;
        this.herd = new ArrayList<>();
    }

    public void installMilkingMachine(MilkingMachine machine){
        this.machine = machine;
        this.machine.setMilkTank(tank);
    }

    public void addAnimal(Animal animal){
        herd.add(animal);
    }

    public void milkAnimal(Animal animal){
        if(animal instanceof Milkable){
            machine.milk((Milkable) animal);
        }
    }

    public void milkAllAnimals(){
        for(Animal animal : herd){
            milkAnimal(animal);
        }
    }

    public ArrayList<Animal> getHerd(){
        return herd;
    }

    @Override
    public String toString() {
        return "Shed [id=" + id + ", machine=" + machine + ", tank=" + tank + "]";
    }
}
