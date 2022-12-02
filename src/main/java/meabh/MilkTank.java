package meabh;

public class MilkTank {
    private final double STANDARD_CAPACITY = 2000;

    private double capacity;
    private double volumeMilk = 0;
    private MilkType milkType = null;

    public MilkTank(){
        this.capacity = STANDARD_CAPACITY;
    }

    public MilkTank(int capacity){
        this.capacity = capacity;
    }

    public double freeSpace(){
        return capacity - volumeMilk;
    }

    public void addToTank(double volume){
        volumeMilk += volume;
    }

    public void addToTank(double volume, MilkType type){
        volumeMilk += volume;
        milkType = type;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolumeMilk() {
        return volumeMilk;
    }

    public MilkType getMilkType() {
        return milkType;
    }

    @Override
    public String toString() {
        return "MilkTank [capacity=" + capacity + ", volumeMilk=" + volumeMilk + "]";
    }
}
