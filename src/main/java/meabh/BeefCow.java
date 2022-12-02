package meabh;

import java.util.Random;

public class BeefCow extends Animal {
    private final double MAX_WEIGHT = 2000;
    private final double MIN_WEIGHT = 1200;
    private final Random rand = new Random();

    private double weight;
    private BeefGrade grade;


    public BeefCow(){
        super();
        this.weight = randomWeight();
        grade = BeefGrade.getRandomGrade();
    }

    private double randomWeight(){
        return (rand.nextDouble() * (MAX_WEIGHT - MIN_WEIGHT)) + MIN_WEIGHT;
    }

    public double getValue(){
        return weight * grade.valuePerKG;
    }

    public double getWeight(){
        return weight;
    }

    public BeefGrade getGrade(){
        return grade;
    }
}
