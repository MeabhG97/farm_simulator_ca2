package meabh;

public class MilkingMachine {
    MilkTank tank;

    public MilkingMachine(){
    }

    public void milk(Milkable milkableAnimal){
        double milk = milkableAnimal.milkAnimal();
        tank.addToTank(milk);
    }

    public MilkTank geMilkTank(){
        return tank;
    }

    public void setMilkTank(MilkTank tank){
        this.tank = tank;
    }
}
