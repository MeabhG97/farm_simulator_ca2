package meabh;

public class Sheep extends Animal {
    private static final double MAX_WEIGHT = 160;
    private static final double MIN_WEIGHT = 90;

    private double weight;
    private MeatGrade grade;

    public Sheep(){
        super();
        this.weight = randomWeight();
        grade = MeatGrade.getRandomGrade();
    }

    private double randomWeight(){
        return RandomUtility.randomBetweenMinMax(MIN_WEIGHT, MAX_WEIGHT);
    }

    public double getWeight() {
        return weight;
    }

    public MeatGrade getGrade() {
        return grade;
    }
}
