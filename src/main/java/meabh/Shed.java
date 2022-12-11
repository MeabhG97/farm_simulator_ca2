package meabh;

import java.util.ArrayList;

public class Shed {
    private int id;
    private MilkingMachine machine;
    private MilkTank tank;
    private ArrayList<Animal> herd;

    private static int shedCount = 0;

    public Shed(){
        this.tank = new MilkTank();
        this.herd = new ArrayList<>();
        this.id = shedCount;
        shedCount++;
    }

    public Shed(MilkTank tank){
        this.tank = tank;
        this.herd = new ArrayList<>();
        this.id = shedCount;
        shedCount++;
    }

    public void installMilkingMachine(MilkingMachine machine){
        this.machine = machine;
        this.machine.setMilkTank(tank);
    }

    public void addAnimal(Animal animal){
        herd.add(animal);
    }

    public void milkAnimal(Animal animal){
        milkMachineInstalled();
        if(animal instanceof Milkable){
            machine.milk((Milkable) animal);
        }
    }

    public void milkAllAnimals(){
        milkMachineInstalled();
        for(Animal animal : herd){
            milkAnimal(animal);
        }
    }

    private void milkMachineInstalled(){
        if(machine == null){
            throw new IllegalStateException("No milking machine installed");
        }
    }

    public MilkingMachine getMilkingMachine(){
        return machine;
    }

    public int hasAnimal(int id){
        for(int i = 0; i < herd.size(); i++){
            if(herd.get(i).getAnimalId() == id){
                return i;
            }
        }
        return -1;
    }

    public void removeAnimal(int index){
        herd.remove(index);
    }

    public double emptyMilkTank(){
        return tank.emptyTank();
    }

    public ArrayList<Animal> getHerd(){
        return herd;
    }

    @Override
    public String toString() {
        return "Shed [id=" + id + ", machine=" + machine + ", tank=" + tank + "]";
    }
}
