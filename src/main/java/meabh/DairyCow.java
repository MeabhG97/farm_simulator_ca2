package meabh;

import java.util.Random;

public class DairyCow extends Animal implements Milkable {
    private static final double MIN_UDDER_CAPACITY = 20;
    private static final double MAX_UDDER_CAPACITY = 40;
    private static Random rand = new Random();

    private String name;
    private double udderCapacity;
    private MilkType milkType = MilkType.COW;

    public DairyCow(){
        super();
        this.udderCapacity = randomUdderCapacity();
    }

    public DairyCow(String name){
        super();
        this.udderCapacity = randomUdderCapacity();
    }

    @Override
    public double milkAnimal(){
        return rand.nextDouble() * udderCapacity;
    }

    private static double randomUdderCapacity(){
        return (rand.nextDouble() * (MAX_UDDER_CAPACITY - MIN_UDDER_CAPACITY)) + MIN_UDDER_CAPACITY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUdderCapacity() {
        return udderCapacity;
    }

    @Override
    public MilkType getMilkType(){
        return milkType;
    }
}
