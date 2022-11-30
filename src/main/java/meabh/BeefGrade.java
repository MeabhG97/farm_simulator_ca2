package meabh;

import java.util.Random;

public enum BeefGrade {
    E1, E2, E3, E4, E5,
    U1, U2, U3, U4, U5,
    R1, R2, R3, R4, R5,
    O1, O2, O3, O4, O5,
    P1, P2, P3, P4, P5;

    private static final Random rand = new Random();

    public static BeefGrade getRandomGrade(){
        BeefGrade[] grades = values();
        return grades[rand.nextInt(grades.length)];
    }
}
