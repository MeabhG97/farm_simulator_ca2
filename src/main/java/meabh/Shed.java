package meabh;

public class Shed {
    private int id;
    private MilkingMachine machine;
    private MilkTank tank;

    public Shed(MilkTank tank){
        this.tank = tank;
    }

    public void installMilkingMachine(MilkingMachine machine){
        this.machine = machine;
        this.machine.setMilkTank(tank);
    }

    public void milkAnimal(Animal animal){

    }

    @Override
    public String toString() {
        return "Shed [id=" + id + ", machine=" + machine + ", tank=" + tank + "]";
    }
}
