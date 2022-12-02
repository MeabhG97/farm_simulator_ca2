package meabh;

import java.util.Random;

public class RandomUtility {

    private static Random randomGen = new Random();

    public static double getDouble(){
        return randomGen.nextDouble();
    }

    public static double randomBetweenMinMax(double min, double max){
        return (randomGen.nextDouble() * (max - min)) + min;
    }
}
