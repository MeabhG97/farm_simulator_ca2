package meabh;

import java.util.Random;

public enum BeefGrade {
    E1(4.7), E2(6.1), E3(6.3), E4(5.7), E5(4.5),
    U1(4.1), U2(5.5), U3(5.7), U4(5.3), U5(4.2),
    R1(3.3), R2(4.9), R3(5.1), R4(4.7), R5(3.5),
    O1(2.9), O2(3.4), O3(4.3), O4(3.3), O5(2.1),
    P1(1.1), P2(1.7), P3(2.1), P4(2.5), P5(1.5);

    public final double valuePerKG;

    private static final Random rand = new Random();

    private BeefGrade(double valuePerKG){
        this.valuePerKG = valuePerKG;
    }

    public static BeefGrade getRandomGrade(){
        BeefGrade[] grades = values();
        return grades[rand.nextInt(grades.length)];
    }
}
