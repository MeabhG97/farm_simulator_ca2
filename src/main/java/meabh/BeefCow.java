package meabh;

public class BeefCow extends Animal {
    private final double MAX_WEIGHT = 1000;
    private final double MIN_WEIGHT = 700;

    private double weight;
    private MeatGrade grade;


    public BeefCow(){
        super();
        this.weight = randomWeight();
        grade = MeatGrade.getRandomGrade();
    }

    private double randomWeight(){
        return RandomUtility.randomBetweenMinMax(MIN_WEIGHT, MAX_WEIGHT);
    }

    public double getValue(){
        return weight * grade.valuePerKG;
    }

    public double getWeight(){
        return weight;
    }

    public MeatGrade getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return super.toString() + " [weight=" + weight + ", grade=" + grade + "]";
    }
}
