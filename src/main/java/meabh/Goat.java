package meabh;


public class Goat extends Animal implements Milkable{
    private static final double MAX_UDDER_CAPACITY = 3;
    private static final double MIN_UDDER_CAPACITY = 2;

    private double udderCapacity;
    private MilkType milkType = MilkType.GOAT;

    public Goat(){
        super();
        this.udderCapacity = randomUdderCapacity();
    }

    private static double randomUdderCapacity(){
        return RandomUtility.randomBetweenMinMax(MIN_UDDER_CAPACITY, MAX_UDDER_CAPACITY);
    }

    @Override
    public double milkAnimal() {
        return RandomUtility.getDouble() * udderCapacity;
    }

    @Override
    public MilkType getMilkType() {
        return this.milkType;
    }
}
