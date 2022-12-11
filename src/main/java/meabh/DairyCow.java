package meabh;

public class DairyCow extends Animal implements Milkable {
    private static final double MIN_UDDER_CAPACITY = 20;
    private static final double MAX_UDDER_CAPACITY = 40;

    private String name;
    private double udderCapacity;
    private MilkType milkType = MilkType.COW;

    public DairyCow(){
        super();
        name = "";
        this.udderCapacity = randomUdderCapacity();
    }

    public DairyCow(String name){
        super();
        this.udderCapacity = randomUdderCapacity();
    }

    @Override
    public double milkAnimal(){
        return RandomUtility.getDouble() * udderCapacity;
    }

    private static double randomUdderCapacity(){
        return RandomUtility.randomBetweenMinMax(MIN_UDDER_CAPACITY, MAX_UDDER_CAPACITY);
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

    @Override
    public double getValue(){
        return udderCapacity * 0.43;
    }

    @Override
    public String toString() {
        return super.toString() + " [name=" + name + ", udderCapacity=" + udderCapacity + ", milkType=" + milkType + "]";
    }
}
