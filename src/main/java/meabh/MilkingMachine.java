package meabh;

public class MilkingMachine {
    MilkTank tank;

    public MilkingMachine(){
    }

    public void milk(Milkable milkableAnimal){
        double milk = milkableAnimal.milkAnimal();
        MilkType type = milkableAnimal.getMilkType();
        if(tank.getMilkType() == type){
            tank.addToTank(milk);
        }
        else if(tank.getMilkType() == null){
            tank.addToTank(milk, type);
        }
    }

    public MilkTank geMilkTank(){
        return tank;
    }

    public void setMilkTank(MilkTank tank){
        this.tank = tank;
    }
}
