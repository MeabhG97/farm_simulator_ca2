package meabh;

import java.util.Random;

public class Goat extends Animal implements Milkable{
    private static final double MAX_UDDER_CAPACITY = 3;
    private static final double MIN_UDDER_CAPACITY = 2;
    private static Random rand = new Random();

    private double udderCapacity;
    private MilkType milkType = MilkType.GOAT;

    public Goat(){
        super();
        this.udderCapacity = randomUdderCapacity();
    }

    private static double randomUdderCapacity(){
        return (rand.nextDouble() * (MAX_UDDER_CAPACITY - MIN_UDDER_CAPACITY)) + MIN_UDDER_CAPACITY;
    }

    @Override
    public double milkAnimal() {
        return rand.nextDouble() * udderCapacity;
    }

    @Override
    public MilkType getMilkType() {
        return this.milkType;
    }
}
